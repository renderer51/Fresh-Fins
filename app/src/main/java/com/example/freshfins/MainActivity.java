package com.example.freshfins;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextView forgot_password, register;
    TextInputLayout phone_no, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forgot_password = findViewById(R.id.forgot_password);
        register = findViewById(R.id.registration);
        phone_no = findViewById(R.id.phone_number);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login_btn);

       /* forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(intent);
            }
        });*/

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phone_no.getEditText().getText().toString().equals("9980174900") && password.getEditText().getText().toString().equals("123456")){
                    Intent intent = new Intent(MainActivity.this, HomePage.class);
                    startActivity(intent);
                }
            }
        });
    }
}