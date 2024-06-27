package com.example.frontend.ui.mainScreen.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend.MainActivity;
import com.example.frontend.R;
import com.example.frontend.ui.login.loginPage;

public class LogoutPage extends AppCompatActivity {

    ImageButton yesbutton;
    ImageButton nobutton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoutpage);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        yesbutton = findViewById(R.id.yesbutton);
        nobutton = findViewById(R.id.nobutton);

        yesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), loginPage.class);
                startActivity(intent);
            }
        });

        nobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}