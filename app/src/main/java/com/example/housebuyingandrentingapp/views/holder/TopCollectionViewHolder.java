package com.example.housebuyingandrentingapp.views.holder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;

public class TopCollectionViewHolder extends BaseViewHolder<HouseRentingVO> {
    private EventItemDelegate mEventItemDelegate;

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
