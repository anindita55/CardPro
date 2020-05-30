package com.example.cardpro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<ItemHolder> {

    private LayoutInflater layoutInflater;
    Context context;
    ArrayList<Item> items;

    public RecyclerAdapter(Context c,ArrayList<Item> items)
    {
        context=c;
        this.items=items;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View view=layoutInflater.inflate(R.layout.list_item,parent,false);
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);

        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {

        holder.textView.setText(""+items.get(position).getTxt());


    }


    @Override
    public int getItemCount() {
        return items.size();
    }
}
