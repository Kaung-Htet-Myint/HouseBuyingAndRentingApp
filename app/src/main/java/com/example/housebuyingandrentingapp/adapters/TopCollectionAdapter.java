package com.example.housebuyingandrentingapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.views.holder.TopCollectionViewHolder;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;

import java.util.List;

public class TopCollectionAdapter extends BaseRecyclerAdapter<TopCollectionViewHolder, HouseRentingVO> {
    private EventItemDelegate mEventItemDelegate;

    public TopCollectionAdapter(EventItemDelegate mEventItemDelegate) {
        this.mEventItemDelegate = mEventItemDelegate;
    }

    @NonNull
    @Override
    public TopCollectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_collection_item_view,parent,false);
        return new TopCollectionViewHolder(view,mEventItemDelegate);
    }

}
