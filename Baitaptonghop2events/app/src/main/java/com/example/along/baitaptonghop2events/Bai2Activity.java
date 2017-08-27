package com.example.along.baitaptonghop2events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai2Activity extends AppCompatActivity {
    Button btnWork;
    EditText userName;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        btnWork = (Button) findViewById(R.id.button2);
        userName = (EditText) findViewById(R.id.editText);
        txt1 = (TextView) findViewById(R.id.textView2);
        btnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = userName.getText().toString();
                String text1 = "Xin moi doi";
                if (str.equals("levanlong")){
                    txt1.setText(text1);
                }
                Toast.makeText(Bai2Activity.this, "Hello " + str, Toast.LENGTH_LONG).show();
            }
        });
    }
}
