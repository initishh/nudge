package com.example.nudgerewriten;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public void onBindViewHolder(@NonNull Adapter_contact_list_2_ViewHolder adapter_contact_list_2_viewHolder, int i) {
        adapter_contact_list_2_viewHolder.contact_in_card.setText(contactList[i]);

        if (i==((contactList.length)-1)){
            adapter_contact_list_2_viewHolder.line_divider.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return contactList.length;
    }

    public class Adapter_contact_list_2_ViewHolder extends RecyclerView.ViewHolder{
        TextView contact_in_card;
        View line_divider;
        public Adapter_contact_list_2_ViewHolder(@NonNull View itemView) {
            super(itemView);
            line_divider = itemView.findViewById(R.id.line_divider);
            contact_in_card = itemView.findViewById(R.id.contact_in_card);
        }
    }
}
