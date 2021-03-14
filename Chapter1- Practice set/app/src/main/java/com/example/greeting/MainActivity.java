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
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText1  = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2) ;
        textView = findViewById(R.id.text) ;

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Add Button Clicked", Toast.LENGTH_SHORT).show();
               String num1 =  editText1.getText().toString() ;
               String num2 = editText2.getText().toString() ;

               int S_num1 =Integer.parseInt(num1) ;
               int S_num2 = Integer.parseInt(num2) ;

               int result = S_num1 + S_num2 ;
               textView.setText("Addition of " + num1  +" and " + num2  + " =" + result);
            }
        });

    }



}