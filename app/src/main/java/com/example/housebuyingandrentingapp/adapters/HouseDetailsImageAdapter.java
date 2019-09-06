package com.example.housebuyingandrentingapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.housebuyingandrentingapp.R;

public class HouseDetailsImageAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }


    //inflate the layout file with view holder
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());
        View view = layoutInflater.inflate(R.layout.detail_image_view,container,false);
        container.addView(view);
        return view;
    }

    //to destroy the removed view
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
