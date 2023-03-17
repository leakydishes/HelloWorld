package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables
    Button myButton;
    EditText myEditText;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ToDo We connect that variable button with actual button

        myButton = findViewById(R.id.button);
        myEditText = findViewById(R.id.editTextTextPersonName2);
        myTextView = findViewById(R.id.textView3);

        myButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //Todo Button Action
                String inputValue = myEditText.getText().toString();
                // myTextView.setText(inputValue);
                myTextView.setText("Welcome to SIT305 \n"+inputValue);


                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
                //Debug to see what button is doing
                //Log.v("Check Message", "Hello World");

            }
        });


    }
}