package com.example.meditech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetStart extends AppCompatActivity {
    Button new_account;
    TextView sign_in_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);
        new_account = findViewById(R.id.new_account);
        sign_in_txt = findViewById(R.id.sign_in_btn);


        new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GetStart.this, SignupActivity.class));
            }
        });


        sign_in_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startActivity(new Intent(GetStart.this, SigninActivity.class));
            }
        });

    }
}