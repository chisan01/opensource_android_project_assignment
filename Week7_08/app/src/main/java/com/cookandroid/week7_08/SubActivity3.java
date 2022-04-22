package com.cookandroid.week7_08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity3 extends AppCompatActivity {

    Button goToMenu, goToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        goToLogin = findViewById(R.id.GoToLogin);
        goToMenu = findViewById(R.id.GoToMenu);

        goToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(3);
                finish();
            }
        });

        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(3 + 3);
                finish();
            }
        });
    }
}