package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ContactPOJO> mArrayList = new ArrayList<>();
    private RecyclerView mRecyclerView1;
    private RecyclerView mRecyclerView2;
    private CustomContactAdapter  mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mRecyclerView1 = findViewById(R.id.recyclerView);
       mRecyclerView2 = findViewById(R.id.recyclerView2);
       mAdapter = new CustomContactAdapter(mArrayList);;

       mRecyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
       mRecyclerView1.setItemAnimator(new DefaultItemAnimator());
       mRecyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
       mRecyclerView1.setAdapter(mAdapter);

       prepareData();
    }

    private void prepareData() {
        ContactPOJO contact = null;
        contact = new ContactPOJO("Ram","9467884671","22/12/1995");
        mArrayList.add(contact);

        contact = new ContactPOJO("Shyam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Raju","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Vipul","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);

        mAdapter.notifyDataSetChanged();
    }
    }
