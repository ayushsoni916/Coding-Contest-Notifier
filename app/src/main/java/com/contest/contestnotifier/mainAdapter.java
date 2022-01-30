package com.contest.contestnotifier;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class mainAdapter extends RecyclerView.Adapter<mainAdapter.viewHolder> {
    Context context;
    int[] programImg;


    public mainAdapter(Context context, int[] programImg ) {
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
//

    }

    @Override
    public int getItemCount() {
        return programImg.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            img = itemView.findViewById(R.id.imageView);
        }

        @Override
        public void onClick(View view) {
//            int pos = this.getAbsoluteAdapterPosition();
            String a= String.valueOf(this.getAbsoluteAdapterPosition());
            Intent i = new Intent(context ,contests.class);
            i.putExtra("value i want" ,a);
//            Toast.makeText(context, ""+pos, Toast.LENGTH_SHORT).show();
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}
