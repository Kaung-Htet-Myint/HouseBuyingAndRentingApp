package com.example.housebuyingandrentingapp.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.housebuyingandrentingapp.data.model.HouseModelImpl;

public abstract class BaseActivity extends AppCompatActivity {
    protected HouseModelImpl houseModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        houseModel = HouseModelImpl.getObjInstance();
    }
}
