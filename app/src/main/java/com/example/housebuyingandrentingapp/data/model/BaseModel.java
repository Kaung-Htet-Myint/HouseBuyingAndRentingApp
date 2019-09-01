package com.example.housebuyingandrentingapp.data.model;

import com.example.housebuyingandrentingapp.network.dataagents.HttpUrlConnectionDataAgentImpl;

public abstract class BaseModel {
    protected HttpUrlConnectionDataAgentImpl mDataAgent;

    BaseModel() { this.mDataAgent = HttpUrlConnectionDataAgentImpl.getObjInstance(); }
}
