package com.example.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning !!", Toast.LENGTH_SHORT).show();

        textView.findViewById(R.id.text);
        textView.setText("Good Morning !!");
    }
}