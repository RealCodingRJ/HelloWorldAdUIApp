package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public TextView view;

    @Override
    public void onCreate(Bundle a) {
        super.onCreate(a);

        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int age = 25;

                List<String> names = new ArrayList<String>();
                names.add("Ryan James");

                button.setText("Hello: " + names.get(0));



            }
        });

    }

}