package com.example.frontend.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend.R;

public class RegisterAge extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerage);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        ImageButton backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterGender.class);
                startActivity(intent);
            }
        });

        ImageButton nextbutton = findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterFavorite.class);
                startActivity(intent);
            }
        });
    }
}
