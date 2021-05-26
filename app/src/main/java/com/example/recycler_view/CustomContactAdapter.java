package com.example.recycler_view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomContactAdapter extends RecyclerView.Adapter<CustomContactAdapter.MyViewholder> {

    private ArrayList<ContactPOJO> arrayList = new ArrayList<>();

    public CustomContactAdapter(ArrayList<ContactPOJO> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Runs only that much time -> jitna time apka screen ka view banega.
        // Power ->  RAM, CPU
        // Min: 1 //
        // Max: 10 // Required by screen.
      View itemView = LayoutInflater.from(parent.getContext()) // Gettting Layout Inflater
              .inflate(R.layout.contact_list_layout,parent,false); // Inflarer
      return new MyViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {

        ContactPOJO contact = arrayList.get(position);
        holder.name.setText(contact.getmName());
        holder.number.setText(contact.getmNumber());
        holder.addedOn.setText(contact.getmAddedOn());


    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyViewholder extends RecyclerView.ViewHolder{

        TextView name, number, addedOn;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textView);
            number = itemView.findViewById(R.id.textView2);
            addedOn = itemView.findViewById(R.id.textView3);
        }
    }
}



