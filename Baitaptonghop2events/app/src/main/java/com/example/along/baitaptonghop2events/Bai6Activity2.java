package com.example.along.baitaptonghop2events;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai6Activity2 extends AppCompatActivity {
    Button btnDone;
    EditText txt_result;
    TextView txt_nhan_giatri;
    public int kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai62);
        addControls();
        addEvents();
    }

    private void addControls() {
        btnDone         = (Button) findViewById(R.id.btn_back);
        txt_result      = (EditText) findViewById(R.id.txt_result);
        txt_nhan_giatri = (TextView) findViewById(R.id.textView7);

        Intent intent = getIntent();
        int so1 = intent.getIntExtra("so1", 0);
        int so2 = intent.getIntExtra("so2", 0);

        String gia_tri = txt_nhan_giatri.getText().toString();
        txt_nhan_giatri.setText(gia_tri + " " + so1 + " + " + so2);
        this.kq = so1 + so2;

        txt_result.setText(Integer.toString(this.kq));
    }

    private void addEvents() {
        final int kq = this.kq;
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("result", kq);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
