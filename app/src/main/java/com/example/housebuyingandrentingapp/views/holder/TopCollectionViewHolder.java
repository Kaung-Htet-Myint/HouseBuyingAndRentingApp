package com.example.housebuyingandrentingapp.views.holder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;
import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopCollectionViewHolder extends BaseViewHolder<HouseRentingVO> {
    private EventItemDelegate mEventItemDelegate;

    @BindView(R.id.tv_3200_sqft)
    TextView tvSquareFeet;

    @BindView(R.id.tv_location_west_minister)
    TextView tvLocationAddress;

    @BindView(R.id.btn_price)
    MaterialButton btnPrice;

    @BindView(R.id.iv_west_minster_london)
    ImageView ivHouse;

    public TopCollectionViewHolder(@NonNull View itemView, final EventItemDelegate delegate) {
        super(itemView);
        mEventItemDelegate = delegate;
        ButterKnife.bind(this,itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEventItemDelegate.onTapEventItem(mData.getId());
            }
        });

    }


    @Override
    public void bindData(HouseRentingVO data) {
        mData = data;
        Glide.with(itemView).load(data.getHouseImageUrl()).into(ivHouse);
        tvLocationAddress.setText(data.getAddress());
        tvSquareFeet.setText(String.valueOf(data.getSquareFeet()));
        btnPrice.setText(String.valueOf(data.getPrice()));
    }
}
