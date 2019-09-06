package com.example.housebuyingandrentingapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.adapters.HouseDetailsImageAdapter;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends BaseActivity {
    public static final String EXTERNAL_HOUSE_ID = "houseExtra";

    public static Intent newIntent(Context context,int eventExtra){
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTERNAL_HOUSE_ID,eventExtra);
        return intent;
    }

    @BindView(R.id.tv_price)
    TextView tvPrice;

    @BindView(R.id.tv_location_west_minister_details)
    TextView tvAddress;

    @BindView(R.id.tv_single_family_house_detail)
    TextView tvDescription;

    @BindView(R.id.tv_3200_sqft_details)
    TextView tvSqFt;

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

        int houseId = getIntent().getIntExtra(EXTERNAL_HOUSE_ID,0);

        HouseRentingVO houseVO = houseModel.findHouseById(houseId);
         bindData(houseVO);

    }

    private void bindData(HouseRentingVO data){
        tvAddress.setText(data.getAddress());
        tvPrice.setText(String.valueOf(data.getPrice()));
        tvSqFt.setText(String.valueOf(data.getSquareFeet()));
        tvDescription.setText(data.getDescription());
    }


}
