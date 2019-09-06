package com.example.housebuyingandrentingapp.network;

import com.example.housebuyingandrentingapp.network.responses.GetEventResponse;
import com.example.housebuyingandrentingapp.utils.HouseRentingConstants;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface HouseApi {
    @FormUrlEncoded
    @POST(HouseRentingConstants.GET_HOUSES)
    Call<GetEventResponse> getAllHouses(@Field(HouseRentingConstants.ACCESS_TOKEN) String accessToken);
}
