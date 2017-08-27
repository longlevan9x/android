package com.example.along.baitaptonghop2events;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai6Activity1 extends AppCompatActivity {
    Button btnAdd;
    EditText txt_so1;
    EditText txt_so2;
    TextView txt_kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai61);
        addControls();
        addEvents();
    }

    private void addControls() {
        btnAdd = (Button) findViewById(R.id.button3);
        txt_so1 = (EditText) findViewById(R.id.txt_so1);
        txt_so2 = (EditText) findViewById(R.id.txt_so2);
        txt_kq  = (TextView) findViewById(R.id.txt_kq);
    }

    private void addEvents() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int so1 = Integer.parseInt(txt_so1.getText().toString());
                    int so2 = Integer.parseInt(txt_so2.getText().toString());
                    Intent intent = new Intent(Bai6Activity1.this, Bai6Activity2.class);
                    intent.putExtra("so1", so1);
                    intent.putExtra("so2", so2);
                    startActivityForResult(intent, 1);
                }
                catch (NumberFormatException ex) {
                    Toast.makeText(Bai6Activity1.this, "Not Number", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    int kq = data.getIntExtra("result", 0);
                    txt_kq.setText("Sum is: " + Integer.toString(kq));
                }
                else {
                    Toast.makeText(Bai6Activity1.this, "Null", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
