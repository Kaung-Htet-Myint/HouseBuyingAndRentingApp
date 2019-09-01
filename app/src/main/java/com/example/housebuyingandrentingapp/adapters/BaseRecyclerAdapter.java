package com.example.housebuyingandrentingapp.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.housebuyingandrentingapp.views.holder.BaseViewHolder;

import java.util.List;

public abstract class BaseRecyclerAdapter <T extends BaseViewHolder<w>, w>extends RecyclerView.Adapter<T> {
    private List<w> mData;

    @Override
    public void onBindViewHolder(@NonNull T holder, int position) {
        holder.bindData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setNewData(List<w> data){
        mData = data;
        notifyDataSetChanged();
    }
}
