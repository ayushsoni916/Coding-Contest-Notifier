package com.contest.contestnotifier;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class contestAdapter extends RecyclerView.Adapter<contestAdapter.MyViewHolder> {
    private List<postPojo> datalist;
    private Context context;

    public contestAdapter(List<postPojo> datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.contest_rcv,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(datalist.get(position).getName());
//        String s=datalist.get(position).getStatus();
//        Toast.makeText(context, postPojo.class.getName(), Toast.LENGTH_SHORT).show();
        String s =datalist.get(position).getStart_time();
        String e =datalist.get(position).getEnd_time();
//        String a=p.substring(0,10);
        Instant timestart = Instant.parse(s.substring(0,10)+"T"+s.substring(11,19)+"Z");
        Instant timeend = Instant.parse(e.substring(0,10)+"T"+e.substring(11,19)+"Z");
        ZoneId.of("Asia/Kolkata");
        LocalDateTime l = LocalDateTime.ofInstant(timestart, ZoneId.of("Asia/Kolkata"));
        LocalDateTime p = LocalDateTime.ofInstant(timeend, ZoneId.of("Asia/Kolkata"));
        holder.starTime.setText("Start : "+l.toString().substring(0,10)+" "+l.toString().substring(11));
         holder.endTime.setText("End    : "+p.toString().substring(0,10)+" "+p.toString().substring(11));
//        holder.duration.setText(datalist.get(position).getDuration());
//        holder.ratedRange.setText(datalist.get(position).get);
//        if (s == "")
        holder.status.setText(s);
        holder.time.setText(datalist.get(position).getIn_24_hours());
        holder.share.setImageResource(R.drawable.share);

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(datalist.get(position).getUrl());
                Intent i =new Intent(Intent.ACTION_VIEW,uri);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
        holder.status.setText(datalist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        TextView name,starTime , endTime
                ,status , time;
        ImageView share;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            itemView.setOnClickListener(this);
            name=itemView.findViewById(R.id.name);
            starTime=itemView.findViewById(R.id.start_time);
            endTime=itemView.findViewById(R.id.end_time);
//            duration=itemView.findViewById(R.id.duration);
//            ratedRange=itemView.findViewById(R.id.rated_range);
            status=itemView.findViewById(R.id.status);
            time=itemView.findViewById(R.id.in_24_hr);
            share = itemView.findViewById(R.id.share);
        }


    }
}
