package com.contest.contestnotifier;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class mainAdapter extends RecyclerView.Adapter<mainAdapter.viewHolder> {
    Context context;
    int[] programImg;

    public mainAdapter(Context context, int[] programImg) {
        this.context = context;
        this.programImg = programImg;
    }

    @NonNull
    @Override
    public mainAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.main_rcv,parent , false);
        viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull mainAdapter.viewHolder holder, int position) {
    holder.img.setImageResource(programImg[position]);
    holder.img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent  i = new Intent(context , contests.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    });
    }

    @Override
    public int getItemCount() {
        return programImg.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
        }
    }
}
