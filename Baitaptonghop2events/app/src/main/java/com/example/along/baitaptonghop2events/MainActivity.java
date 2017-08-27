package com.example.along.baitaptonghop2events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btnOk;
    TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk    = (Button)   findViewById(R.id.button);
        txtHello = (TextView) findViewById(R.id.textView);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTime();
            }
        });
    }

    private void updateTime() {
        Date dt = new Date();
        txtHello.setText(dt.toString());
        Toast.makeText(MainActivity.this, dt.toString(), Toast.LENGTH_LONG).show();
    }
}
