package com.example.cardpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       recyclerView=findViewById(R.id.recycledlist);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));

       recyclerAdapter=new RecyclerAdapter(this,getitems());

       recyclerView.setAdapter(recyclerAdapter);

    }

    private ArrayList<Item> getitems()
    {
        //ArrayList<Item> arrayList=new ArrayList<>();

        final ArrayList<Item> items=new ArrayList<>();


        Item item0=new Item();
        item0.setTxt("CardView1");
        items.add(item0);
        Item item1=new Item();
        item1.setTxt("CardView1");
        items.add(item1);
        Item item2=new Item();
        item2.setTxt("CardView1");
        items.add(item2);
        Item item3=new Item();
        item3.setTxt("CardView1");
        items.add(item3);
        Item item4=new Item();
        item4.setTxt("CardView1");
        items.add(item4);
        Item item9=new Item();
        item9.setTxt("CardView1");
        items.add(item4);
        Item item5=new Item();
        item5.setTxt("CardView1");
        items.add(item4);
        Item item6=new Item();
        item6.setTxt("CardView1");
        items.add(item4);
        Item item7=new Item();
        item7.setTxt("CardView1");
        items.add(item4);
        Item item8=new Item();
        item8.setTxt("CardView1");
        items.add(item4);


        return items;

    }


}
