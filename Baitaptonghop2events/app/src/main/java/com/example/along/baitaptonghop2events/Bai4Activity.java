package com.example.along.baitaptonghop2events;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai4Activity extends AppCompatActivity {
    Button btnExit;
    Button btnLogin;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        addControls();
        addEvents();
    }

    private void addControls() {
        btnExit = (Button) findViewById(R.id.btn_exit);
        btnLogin = (Button) findViewById(R.id.btn_login);
        username = (EditText) findViewById(R.id.txtUsername);
        password = (EditText) findViewById(R.id.txtPassword);
    }

    private void addEvents() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Exit?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // Perform Your Task Here--When Yes Is Pressed.
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // Perform Your Task Here--When No is pressed
                        dialog.cancel();
                    }
                }).show();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = username.getText().toString();
                String passWord = password.getText().toString();
                if (userName.equals("TIN8A1") && passWord.equals("123456")){
                    Toast.makeText(Bai4Activity.this, "Login Success!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Bai4Activity.this, ChonActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(Bai4Activity.this, "Username or Password wroooong!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
