package com.example.housebuyingandrentingapp.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.housebuyingandrentingapp.data.model.HouseModelImpl;
import com.google.android.material.snackbar.Snackbar;

public abstract class BaseActivity extends AppCompatActivity {
    protected HouseModelImpl houseModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        houseModel = HouseModelImpl.getObjInstance();
    }

    protected void showIndefiniteSnackBar(String message){
        final Snackbar snackbar = Snackbar.make(getWindow().getDecorView(),message,Snackbar.LENGTH_INDEFINITE);
       /* snackbar.setAction(getResources().getString(R.id.), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });*/
    }
}
