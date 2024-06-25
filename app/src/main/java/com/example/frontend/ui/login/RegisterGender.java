package com.example.frontend.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend.R;

public class RegisterGender extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registergender);

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

        ImageButton nextbutton = findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterAge.class);
                startActivity(intent);
            }
        });
    }
}
