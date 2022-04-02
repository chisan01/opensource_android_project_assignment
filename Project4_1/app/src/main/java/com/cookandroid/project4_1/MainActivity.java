package com.cookandroid.project4_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        
        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);
        btnAdd = findViewById(R.id.BtnAdd);
        btnSub = findViewById(R.id.BtnSub);
        btnMul = findViewById(R.id.BtnMul);
        btnDiv = findViewById(R.id.BtnDiv);
        btnMod = findViewById(R.id.BtnMod);
        textResult = findViewById(R.id.TextResult);
        
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_LONG).show();
                } else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result);
                }
            }
        });
        
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_LONG).show();
                } else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result);
                }
            }
        });
        
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_LONG).show();
                } else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result);
                }
            }
        });
        
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_LONG).show();
                } else if (Double.parseDouble(num2) != 0) {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result);
                } else {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_LONG).show();
                }
            }
        });
        
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_LONG).show();
                } else if (Double.parseDouble(num2) != 0) {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과: " + result);
                } else {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}