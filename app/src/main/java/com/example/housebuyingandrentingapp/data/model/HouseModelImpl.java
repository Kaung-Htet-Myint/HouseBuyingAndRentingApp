package com.example.housebuyingandrentingapp.data.model;

import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.network.dataagents.EventDataAgent;
import com.example.housebuyingandrentingapp.utils.HouseRentingConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseModelImpl extends BaseModel implements EventModel{
    private Map<Integer, HouseRentingVO> houseRentingDataRepository;
    private static HouseModelImpl objInstance;

    private HouseModelImpl() {
        houseRentingDataRepository = new HashMap<>();
    }

    public static HouseModelImpl getObjInstance(){
        if (objInstance == null){
            objInstance = new HouseModelImpl();
        }
        return objInstance;
    }

    public List<HouseRentingVO> getAllEvent(){
        return null;
    }
    @Override
    public void getEvent(final GetEventFromDataLayerDelegate delegate) {
        mDataAgent.getEvents(HouseRentingConstants.DUMMY_ACCESS_TOKEN,new EventDataAgent.GetEventForNetworkDelegate() {

            @Override
            public void onSuccess(List<HouseRentingVO> event) {
                for (HouseRentingVO houseRentingVO : event){
                    houseRentingDataRepository.put(houseRentingVO.getId(),houseRentingVO);
                }
                delegate.onSuccess(event);
            }

            @Override
            public void onFailure(String errorMessage) {
                delegate.onFailure(errorMessage);
            }
        });
    }

    @Override
    public HouseRentingVO findHouseById(int houseId) {
        HouseRentingVO houseVO = houseRentingDataRepository.get(houseId);
        return houseVO;
    }


}
