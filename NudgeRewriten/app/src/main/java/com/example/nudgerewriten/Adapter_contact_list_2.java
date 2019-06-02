package com.example.nudgerewriten;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class Adapter_contact_list_2 extends RecyclerView.Adapter<Adapter_contact_list_2.Adapter_contact_list_2_ViewHolder> {
    String[] contactList;

    public Adapter_contact_list_2(String [] contactList){
        this.contactList=contactList;
    }


    @NonNull
    @Override
    public Adapter_contact_list_2_ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.adapter_contact_list_2,viewGroup,false);
        return new Adapter_contact_list_2_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_contact_list_2_ViewHolder adapter_contact_list_2_viewHolder, final int i) {
        //setting contact's image
        adapter_contact_list_2_viewHolder.contact_image_in_card.setImageResource(R.mipmap.person_1);

        //setting contact's name
        adapter_contact_list_2_viewHolder.contact_in_card.setText(contactList[i]);
        if (i==((contactList.length)-1)){
            adapter_contact_list_2_viewHolder.line_divider.setVisibility(View.GONE);
        }
        //
        //making item clickable in contact card list
        adapter_contact_list_2_viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(adapter_contact_list_2_viewHolder.itemView.getContext(),Activity_farmerlist_1.class);
                adapter_contact_list_2_viewHolder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactList.length;
    }

    public class Adapter_contact_list_2_ViewHolder extends RecyclerView.ViewHolder{
        TextView contact_in_card;
        View line_divider;
        ImageView contact_image_in_card;
        public Adapter_contact_list_2_ViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_image_in_card = itemView.findViewById(R.id.contact_image_in_card);
            line_divider = itemView.findViewById(R.id.line_divider);
            contact_in_card = itemView.findViewById(R.id.contact_in_card);
        }
    }
}
