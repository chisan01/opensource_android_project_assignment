package com.cookandroid.week4_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button exchangeBtn;
    ImageView imgView1, imgView2;

    boolean isExchanged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exchangeBtn = findViewById(R.id.ExchangeBtn);
        imgView1 = findViewById(R.id.ImgView1);
        imgView2 = findViewById(R.id.ImgView2);

        isExchanged = false;
        exchangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isExchanged) {
                    isExchanged = false;
                    imgView1.setImageResource(R.drawable.picture1);
                    imgView2.setImageResource(R.drawable.picture2);
                }
                else {
                    isExchanged = true;
                    imgView1.setImageResource(R.drawable.picture2);
                    imgView2.setImageResource(R.drawable.picture1);
                }
            }
        });
    }
}