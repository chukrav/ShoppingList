package com.example.android.shoppinglist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class VegetableFragment extends Fragment {

    private static final int NUM_LIST_ITEMS = 100;
    private GreenAdapter mAdapter;
    private RecyclerView mItemsList;

    public VegetableFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
//        return textView;
        View rootView = inflater.inflate(R.layout.activity_main,container,false);

        mItemsList = (RecyclerView) rootView.findViewById(R.id.rv_items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mItemsList.setLayoutManager(layoutManager);
        mItemsList.setHasFixedSize(true);
        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);
        mItemsList.setAdapter(mAdapter);

        return rootView;
    }

}
