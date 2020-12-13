package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private Button btn1;
    private EditText editText;
    private ArrayList<String> a;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch darkmode;
    private View viewMy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewMy = findViewById(R.id.viewmy);
        text1 = findViewById(R.id.myText);
        btn1 = findViewById(R.id.click);
        editText = findViewById(R.id.editText);
        darkmode = findViewById(R.id.switch1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long OneDollar = 10000;
                long editTextInt = parseInt(editText.getText().toString())*OneDollar;
                text1.setText("UZS:"+ editTextInt +"so'm");
            }
        });
        darkmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(darkmode.isChecked()){
                    Toast.makeText(MainActivity.this,"Dark mode enablad" , Toast.LENGTH_SHORT).show();
                    viewMy.setBackgroundColor(Color.BLACK);
                    text1.setTextColor(Color.WHITE);
                    darkmode.setTextColor(Color.WHITE);
                    editText.setTextColor(Color.WHITE);
                    editText.setHintTextColor(Color.WHITE);
                }else{
                    Toast.makeText(MainActivity.this,"Light mode enablad" , Toast.LENGTH_SHORT).show();
                    viewMy.setBackgroundColor(Color.WHITE);
                    text1.setTextColor(Color.BLACK);
                    darkmode.setTextColor(Color.BLACK);
                    editText.setTextColor(Color.BLACK);
                    editText.setHintTextColor(Color.BLACK);
                }
            }
        });
        darkmode.setTextOff("Light mode");
        darkmode.setTextOn("Dark mode");
    }
}