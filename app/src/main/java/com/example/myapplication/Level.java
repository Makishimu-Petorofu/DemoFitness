package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Level extends AppCompatActivity {
    Button next;
    Integer score = 0;
    LinearLayout l1, l2, l3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_layout);



        l1 = findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 1;
                l1.setBackgroundResource(R.drawable.genderclick);
                l2.setBackgroundResource(R.drawable.genderb);
                l3.setBackgroundResource(R.drawable.genderb);
            }
        });
        l2 = findViewById(R.id.l2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 2;
                l2.setBackgroundResource(R.drawable.genderclick);
                l1.setBackgroundResource(R.drawable.genderb);
                l3.setBackgroundResource(R.drawable.genderb);
            }
        });
        l3 = findViewById(R.id.l3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 3;
                l3.setBackgroundResource(R.drawable.genderclick);
                l2.setBackgroundResource(R.drawable.genderb);
                l1.setBackgroundResource(R.drawable.genderb);
            }
        });


        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (score) {
                    case (1):
                        Intent m = new Intent(Level.this, weiht.class);
                        break;
                    case (2):
                        Intent f = new Intent(Level.this, MainActivity.class);
                        startActivity(f);
                    case (3):
                        Intent k = new Intent(Level.this, MainActivity.class);
                        startActivity(k);
                }
            }
        });
    }
}
