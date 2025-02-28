package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public TextView view;

    public static Random r = new Random();


    @Override
    public void onCreate(Bundle a) {
        super.onCreate(a);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        view = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")

            public void onClick(View v) {

            @SuppressLint({"NewApi", "LocalSuppress"})
            int num1 = r.nextInt(1,10 + 1);

            @SuppressLint({"NewApi", "LocalSuppress"})
            int num2 = r.nextInt(1,5 + 1);

                view.setText(num1 + " + " + num2 + " = " +
                        (num1 + num2));

            }
        });

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                view.setText("Empty...");

            }
        });


    }

}