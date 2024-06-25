package com.example.frontend.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend.R;

public class RegisterRegion extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerregion);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton nextbutton = findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterGender.class);
                startActivity(intent);
            }
        });
    }
}
