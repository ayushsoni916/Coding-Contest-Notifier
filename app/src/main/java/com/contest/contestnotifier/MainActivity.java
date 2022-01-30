package com.contest.contestnotifier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    mainAdapter adapter;
    RecyclerView.LayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT>=21){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.white));
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        int[] programImg = {R.drawable.atcoder , R.drawable.cf, R.drawable.codechef, R.drawable.cover
                ,R.drawable.download , R.drawable.images,R.drawable.hackerearth,R.drawable.topcoder};


        rcv = findViewById(R.id.rcv);
        manager = new LinearLayoutManager(this);
        rcv.setLayoutManager(manager);
        adapter = new mainAdapter(getApplicationContext() , programImg);
        rcv.setAdapter(adapter);

    }

}