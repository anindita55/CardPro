package com.example.cardpro;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.t1);
    }
}
