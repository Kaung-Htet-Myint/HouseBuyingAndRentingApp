package com.example.housebuyingandrentingapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.adapters.HouseDetailsImageAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends BaseActivity {
    @BindView(R.id.vp_details_images)
    ViewPager vpDetailsImage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

        HouseDetailsImageAdapter adapter = new HouseDetailsImageAdapter();
        vpDetailsImage.setAdapter(adapter);

        final ImageView backBtn = findViewById(R.id.iv_back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

}
