package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View v) {
        EditText object_a = findViewById(R.id.editText);
        String text_a = object_a.getText().toString();
        //Проверка на пустую строку
        int a = Integer.parseInt(text_a);
        double D = Math.sqrt(4*4 - 4*a*5);
        Log.e("RRRRRRRRRRRRRRR",Double.toString(D));
        TextView res = findViewById(R.id.textView4);
        res.setText("Результат:");

    }
}
