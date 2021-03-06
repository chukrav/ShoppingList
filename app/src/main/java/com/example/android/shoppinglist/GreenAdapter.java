package com.example.android.shoppinglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GreenAdapter extends RecyclerView.Adapter <GreenAdapter.ItemViewHolder> {

    private static final String TAG = GreenAdapter.class.getSimpleName();

    private int mNumberItems;

    public GreenAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        ItemViewHolder viewHolder = new ItemViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView listItem;

        public ItemViewHolder(View itemView) {
            super(itemView);
            listItem = (TextView) itemView.findViewById(R.id.tv_item);
        }

        void bind(int listIndex) {
            listItem.setText(String.valueOf(listIndex));
        }
    }

}
