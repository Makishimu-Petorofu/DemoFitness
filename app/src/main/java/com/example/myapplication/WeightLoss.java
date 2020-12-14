package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WeightLoss extends AppCompatActivity {
        Button male, female, next;
    Integer score = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_layout);

        male = findViewById(R.id.male);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 1;
                male.setBackgroundResource(R.drawable.genderclick);
                female.setBackgroundResource(R.drawable.genderb);
            }
        });

        female = findViewById(R.id.female);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 2;
                female.setBackgroundResource(R.drawable.genderclick);
                male.setBackgroundResource(R.drawable.genderb);
            }
        });
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (score) {
                    case (1):
                        Intent m = new Intent(WeightLoss.this, Male.class);
                        startActivity(m);
                        break;
                    case (2):
                        Intent f = new Intent(WeightLoss.this, Female.class);
                        startActivity(f);
                }
            }
        });
    }

}
