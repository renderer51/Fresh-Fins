package com.example.freshfins;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Register extends AppCompatActivity {
    Button fishermanRegistration, userRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fishermanRegistration = findViewById(R.id.fisherman_reg);
        userRegistration = findViewById(R.id.customer_reg);

        fishermanRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, FishermanRegistration.class);
                startActivity(intent);
            }
        });

        userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, UserRegistration.class);
                startActivity(intent);
            }
        });
    }
}