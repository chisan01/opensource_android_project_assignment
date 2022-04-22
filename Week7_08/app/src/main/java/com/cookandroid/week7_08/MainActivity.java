package com.cookandroid.week7_08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputID, inputPW;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputID = findViewById(R.id.InputID);
        inputPW = findViewById(R.id.InputPW);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputID.getText().toString().equals("") || inputPW.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "사용자 이름과 비밀번호를 모두 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivityForResult(new Intent(MainActivity.this, MenuActivity.class), 0);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (resultCode) {
            case 1:
                Toast.makeText(MainActivity.this, "고객 관리", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this, "매출 관리", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this, "상품 관리", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}