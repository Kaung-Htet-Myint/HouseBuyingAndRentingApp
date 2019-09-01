package com.example.housebuyingandrentingapp.network.dataagents;

import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;

import java.util.List;

public interface EventDataAgent {
    void getEvents(String accessToken,GetEventForNetworkDelegate delegate);

    interface GetEventForNetworkDelegate{
       void onSuccess(List<HouseRentingVO> event);
        void onFailure(String errorMessage);
    }
}
