package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch startSwitch;
    RadioGroup rGroup1;
    RadioButton rdoAndroid10, rdoAndroid11, rdoAndroid12;
    ImageView imgAndroid;
    Button exitBtn, resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = findViewById(R.id.Text1);
        startSwitch = findViewById(R.id.StartSwitch);

        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        rdoAndroid10 = findViewById(R.id.RdoAndroid10);
        rdoAndroid11 = findViewById(R.id.RdoAndroid11);
        rdoAndroid12 = findViewById(R.id.RdoAndroid12);

        imgAndroid = findViewById(R.id.ImgAndroid);

        exitBtn = findViewById(R.id.ExitBtn);
        resetBtn = findViewById(R.id.ResetBtn);

        startSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (startSwitch.isChecked()) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgAndroid.setVisibility(View.VISIBLE);
                    exitBtn.setVisibility(View.VISIBLE);
                    resetBtn.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgAndroid.setVisibility(View.INVISIBLE);
                    exitBtn.setVisibility(View.INVISIBLE);
                    resetBtn.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoAndroid10:
                        imgAndroid.setImageResource(R.drawable.android10);
                        break;
                    case R.id.RdoAndroid11:
                        imgAndroid.setImageResource(R.drawable.android11);
                        break;
                    case R.id.RdoAndroid12:
                        imgAndroid.setImageResource(R.drawable.android12);
                        break;
                }
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rGroup1.clearCheck();
                startSwitch.setChecked(false);
                imgAndroid.setImageResource(0);
            }
        });
    }
}