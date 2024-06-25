package com.example.frontend.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend.MainActivity;
import com.example.frontend.R;

public class RegisterFavorite extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerfavorite);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        ImageButton backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterRegion.class);
                startActivity(intent);
            }
        });

        ImageButton completebutton = findViewById(R.id.completebutton);
        completebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
