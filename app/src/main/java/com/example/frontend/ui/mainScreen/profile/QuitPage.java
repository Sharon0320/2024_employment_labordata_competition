package com.example.frontend.ui.mainScreen.profile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frontend.R;

public class QuitPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quitpage);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
