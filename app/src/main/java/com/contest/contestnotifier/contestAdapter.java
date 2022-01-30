package com.contest.contestnotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(datalist.get(position).getName());
        holder.url.setText(datalist.get(position).getUrl());
//        Toast.makeText(context, postPojo.class.getName(), Toast.LENGTH_SHORT).show();
        holder.starTime.setText(datalist.get(position).getStart_time());
        holder.endTime.setText(datalist.get(position).getEnd_time());
        holder.duration.setText(datalist.get(position).getDuration());
//        holder.ratedRange.setText(datalist.get(position).get);
        holder.status.setText(datalist.get(position).getStatus());
        holder.time.setText(datalist.get(position).getIn_24_hours());
//        holder.status.setText(datalist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,url,starTime , endTime,duration
                ,status , time;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            url=itemView.findViewById(R.id.url);
            starTime=itemView.findViewById(R.id.start_time);
            endTime=itemView.findViewById(R.id.end_time);
            duration=itemView.findViewById(R.id.duration);
//            ratedRange=itemView.findViewById(R.id.rated_range);
            status=itemView.findViewById(R.id.status);
            time=itemView.findViewById(R.id.in_24_hr);
        }
    }
}
