package com.example.android.shoppinglist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 100;
    private GreenAdapter mAdapter;
    private RecyclerView mItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new VegetableFragment())
                .commit();

//        mItemsList = (RecyclerView) findViewById(R.id.rv_items);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        mItemsList.setLayoutManager(layoutManager);
//        mItemsList.setHasFixedSize(true);
//        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);
//        mItemsList.setAdapter(mAdapter);
    }
}
