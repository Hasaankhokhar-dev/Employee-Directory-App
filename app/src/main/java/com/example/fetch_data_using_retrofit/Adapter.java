package com.example.fetch_data_using_retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder> {
    List<ResponceModel> data;
    public Adapter(List<ResponceModel> data) {
        this.data = data;
    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.t1.setText(data.get(position).name);
        holder.t2.setText(data.get(position).desig);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView t1,t2;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.t1);
            t2 = itemView.findViewById(R.id.tt2);
        }
    }
}
