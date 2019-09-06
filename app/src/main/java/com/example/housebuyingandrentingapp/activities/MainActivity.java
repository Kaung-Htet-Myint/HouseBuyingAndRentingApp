package com.example.housebuyingandrentingapp.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.adapters.TopCollectionAdapter;
import com.example.housebuyingandrentingapp.data.model.EventModel;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements EventItemDelegate {

    @BindView(R.id.rv_top_collection)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        ButterKnife.bind(this);

        final TopCollectionAdapter adapter = new TopCollectionAdapter(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        //TabLayout tabLayout = findViewById(R.id.tab_layout);

        houseModel.getEvent(new EventModel.GetEventFromDataLayerDelegate() {
            @Override
            public void onSuccess(List<HouseRentingVO> event) {
                adapter.setNewData(event);
            }

            @Override
            public void onFailure(String errorMessage) {
                showIndefiniteSnackBar(errorMessage);
            }
        });

    }

    @Override
    public void onTapEventItem(int houseId) {
        Intent intent = DetailActivity.newIntent(getApplicationContext(),houseId);
        startActivity(intent);

        //startActivity(new Intent(this, DetailActivity.class));
    }
}
