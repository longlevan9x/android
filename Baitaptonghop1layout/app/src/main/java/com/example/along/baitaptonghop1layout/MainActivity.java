package com.example.along.baitaptonghop1layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnActivity_b1;
    Button btnActivity_b2;
    Button btnActivity_b3;
    Button btnActivity_b4;
    Button btnActivity_b5;
    Button btnActivity_b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        btnActivity_b1 = (Button) findViewById(R.id.btnActivity_b1);
        btnActivity_b2 = (Button) findViewById(R.id.btnActivity_b2);
        btnActivity_b3 = (Button) findViewById(R.id.btnActivity_b3);
        btnActivity_b4 = (Button) findViewById(R.id.btnActivity_b4);
        btnActivity_b5 = (Button) findViewById(R.id.btnActivity_b5);
        btnActivity_b6 = (Button) findViewById(R.id.btnActivity_b6);
    }

    private void addEvents() {
        btnActivity_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_bai1);
            }
        });

        btnActivity_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_bai2);
            }
        });
        btnActivity_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_bai3);
            }
        });
        btnActivity_b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_bai4);
            }
        });
        btnActivity_b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_bai5);
            }
        });
        btnActivity_b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_bai6);
            }
        });


    }

}
