package com.example.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    EditText editText1 ;
    EditText editText2 ;
    Button button ;
    Button button2 ;
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        editText1  = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2) ;
        textView = findViewById(R.id.text) ;






        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Add Button Clicked", Toast.LENGTH_SHORT).show();


               // Addition
                int sum = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
                textView.setText("The Sum is " + sum);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Multiplication
                int mul = Integer.parseInt(editText1.getText().toString()) * Integer.parseInt(editText2.getText().toString());
                textView.setText("The Multiplication is " + mul);
            }
        });

    }



}