package com.contest.contestnotifier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class contests extends AppCompatActivity {
    ApiInterface apiInterface;
    RecyclerView rcv2;
    contestAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contests);
        rcv2 = findViewById(R.id.rcv2);
        Intent intent = getIntent();
        String data = intent.getStringExtra("value i want");
        apiInterface =RetrofitInstance.getRetrofit().create(ApiInterface.class);

        switch (Integer.parseInt(data)){
            case 0:
                apiInterface.atcoder().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case 1:

                apiInterface.codeforces().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case 2:

                apiInterface.codechef().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case 3:

                apiInterface.leetcode().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case 4:
                apiInterface.kickstart().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });

                break;
            case 5:

                apiInterface.hackerrank().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;

            case 6:

                apiInterface.hackerearth().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case 7:

                apiInterface.topcoder().enqueue(new Callback<List<postPojo>>() {
                    @Override
                    public void onResponse(Call<List<postPojo>> call, Response<List<postPojo>> response) {
                        if(response.body().size()>0){

                            List<postPojo> postPojos = response.body();
                            adapter = new contestAdapter(postPojos,getApplicationContext());
                            LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                            rcv2.setLayoutManager(manager);
                            rcv2.setAdapter(adapter);
//                            Toast.makeText(contests.this, "List is not empty", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(contests.this, "List is empty", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<postPojo>> call, Throwable t) {
                        Toast.makeText(contests.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
        }





    }


}