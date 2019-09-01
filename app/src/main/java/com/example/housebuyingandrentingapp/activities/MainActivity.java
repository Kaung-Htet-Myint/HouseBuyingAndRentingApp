package com.example.housebuyingandrentingapp.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.housebuyingandrentingapp.R;
import com.example.housebuyingandrentingapp.adapters.TopCollectionAdapter;
import com.example.housebuyingandrentingapp.data.model.EventModel;
import com.example.housebuyingandrentingapp.data.vos.HouseRentingVO;
import com.example.housebuyingandrentingapp.delegates.EventItemDelegate;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;

import java.util.List;

public class MainActivity extends BaseActivity implements EventItemDelegate {

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

        final TopCollectionAdapter adapter = new TopCollectionAdapter(this);

        RecyclerView recyclerView = findViewById(R.id.rv_top_collection);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        //TabLayout tabLayout = findViewById(R.id.tab_layout);

        houseModel.getEvent(new EventModel.GetEventFromDataLayerDelegate() {
            @Override
            public void onSuccess(List<HouseRentingVO> event) {

            }

            @Override
            public void onFailure(String errorMessage) {

            }
        });

    }

    @Override
    public void onTapEventItem() {
        /*Intent intent = new Intent(getApplicationContext(),DeatailActivity.class);
        startActivity(intent);*/

        startActivity(new Intent(this,DeatailActivity.class));
    }
}
