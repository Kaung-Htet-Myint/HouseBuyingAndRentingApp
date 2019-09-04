package com.example.housebuyingandrentingapp.network.responses;

import com.example.housebuyingandrentingapp.data.model.EventModel;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.utils.HouseRentingConstants;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetEventResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private List<HouseRentingVO> houseRentingList;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<HouseRentingVO> getHouseRentingList() {
        return houseRentingList;
    }

    public void setHouseRentingList(List<HouseRentingVO> houseRentingList) {
        this.houseRentingList = houseRentingList;
    }

    public Boolean isResponseOK(){
        return code == HouseRentingConstants.CODE_RESPONSE_OK && houseRentingList != null;
    }



}
