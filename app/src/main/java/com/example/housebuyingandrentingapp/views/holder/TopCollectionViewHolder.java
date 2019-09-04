package com.example.housebuyingandrentingapp.views.holder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;
import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

import butterknife.BindView;

public class TopCollectionViewHolder extends BaseViewHolder<HouseRentingVO> {
    private EventItemDelegate mEventItemDelegate;

    @BindView(R.id.tv_location_west_minister)
    TextView tvLocationAddress;

    @BindView(R.id.btn_price)
    MaterialButton btnPrice;

    @BindView(R.id.iv_west_minster_london)
    ImageView ivHouse;

    public TopCollectionViewHolder(@NonNull View itemView, final EventItemDelegate delegate) {
        super(itemView);
        mEventItemDelegate = delegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEventItemDelegate.onTapEventItem();
            }
        });
    }


    @Override
    public void bindData(HouseRentingVO data) {

    }
}
