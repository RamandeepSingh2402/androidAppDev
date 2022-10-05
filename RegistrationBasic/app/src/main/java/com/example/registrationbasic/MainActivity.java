package com.example.registrationbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // onClick method which displays the FirstName, LastName and the associated email
    public void onClick(View view){
        EditText editTextFirst = findViewById(R.id.editTextFirst);
        EditText editTextLast = findViewById(R.id.editTextLast);
        EditText editTextMail = findViewById(R.id.editTextMail);

        TextView textViewFirst = findViewById(R.id.textViewFirst);
        TextView textViewLast = findViewById(R.id.textViewLast);
        TextView textViewMail = findViewById(R.id.textViewMail);

        textViewFirst.setText("First Name: " + editTextFirst.getText().toString());
        textViewLast.setText("Last Name: " + editTextLast.getText().toString());
        textViewMail.setText("Registered Mail: " + editTextMail.getText().toString());


    }
}