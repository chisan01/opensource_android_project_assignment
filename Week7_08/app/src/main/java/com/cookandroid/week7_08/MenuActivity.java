package com.cookandroid.week7_08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        btn3 = findViewById(R.id.Btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MenuActivity.this, SubActivity1.class), 0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MenuActivity.this, SubActivity2.class), 0);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MenuActivity.this, SubActivity3.class), 0);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (resultCode) {
            case 1:
                Toast.makeText(MenuActivity.this, "고객 관리", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MenuActivity.this, "매출 관리", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MenuActivity.this, "상품 관리", Toast.LENGTH_SHORT).show();
                break;
            default:
                setResult(resultCode - 3);
                finish();
                break;
        }
    }
}