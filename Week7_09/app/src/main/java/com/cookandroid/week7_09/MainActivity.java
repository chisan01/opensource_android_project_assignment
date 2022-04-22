package com.cookandroid.week7_09;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static class MyFragment extends Fragment {

        View dialogView;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.my_fragment, container, false);

            EditText inputAge = v.findViewById(R.id.InputAge);
            EditText inputName = v.findViewById(R.id.InputName);
            Button inputBirth = v.findViewById(R.id.InputBirth);
            Button save = v.findViewById(R.id.SaveBtn);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm//dd");
            inputBirth.setText(sdf.format(d));

            inputBirth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialogView = View.inflate(MyFragment.super.getContext(), R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MyFragment.super.getContext());
                    DatePicker datePicker = dialogView.findViewById(R.id.datePicker);
                    dlg.setView(dialogView);
                    dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            inputBirth.setText(datePicker.getYear() + "/" + datePicker.getMonth() + "/" + datePicker.getDayOfMonth());
                        }
                    });
                    dlg.show();
                }
            });

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MyFragment.super.getContext(),
                            inputName.getText().toString() + " "
                                    + inputAge.getText().toString() + " "
                                    + inputBirth.getText().toString(),
                            Toast.LENGTH_SHORT).show();
                }
            });

            return v;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFragment myFragment = new MyFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.myFragment, myFragment);
        fragmentTransaction.commit();
    }
}