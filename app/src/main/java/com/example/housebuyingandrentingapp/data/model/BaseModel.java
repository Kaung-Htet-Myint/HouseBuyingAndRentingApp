package com.example.housebuyingandrentingapp.data.model;

import com.example.housebuyingandrentingapp.network.dataagents.HttpUrlConnectionDataAgentImpl;
import com.example.housebuyingandrentingapp.network.dataagents.OkHttpDataAgentImpl;
import com.example.housebuyingandrentingapp.network.dataagents.RetrofitDataAgentImpl;

public abstract class BaseModel {
    /*protected HttpUrlConnectionDataAgentImpl mDataAgent;
    BaseModel() { this.mDataAgent = HttpUrlConnectionDataAgentImpl.getObjInstance(); }*/

    /*protected OkHttpDataAgentImpl mDataAgent;
    BaseModel() { this.mDataAgent = OkHttpDataAgentImpl.getObjInstance(); }*/

    protected RetrofitDataAgentImpl mDataAgent;
    BaseModel() { this.mDataAgent = RetrofitDataAgentImpl.getObjInstance(); }
}
