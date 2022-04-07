package com.cookandroid.week5_mission_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputBox;
    TextView byteSizeTextView;
    Button submitBtn, closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputBox = findViewById(R.id.InputBox);
        byteSizeTextView = findViewById(R.id.ByteSizeTextView);
        submitBtn = findViewById(R.id.SubmitBtn);
        closeBtn = findViewById(R.id.CloseBtn);

        // 텍스트 입력상자에 입력되는 글자의 바이트 수를 '10/80바이트'와 같은 포맷으로 표시.
        inputBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                int byteSize = inputBox.getText().toString().getBytes().length;
                byteSizeTextView.setText(byteSize + "/ 80 바이트");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        // 전송 버튼을 누르면 입력된 글자를 화면에 토스트로 표시
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        inputBox.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}