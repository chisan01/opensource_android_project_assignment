package com.example.decentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1;
    Button button2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.number_12);

        editText = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener((a) -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(editText.getText())));
            startActivity(browserIntent);
        });

        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        imageView = (ImageView) findViewById(R.id.imageView);
        radioButton1.setOnClickListener((a) -> {
            imageView.setImageResource(R.drawable.number_11);
        });
        radioButton2.setOnClickListener((a) -> {
            imageView.setImageResource(R.drawable.number_12);
        });
    }
}