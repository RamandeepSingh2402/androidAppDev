package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // onClick method
    public void onBtnClick(View view){
        //changing the text displayed in the textView
        TextView txtMessage = findViewById(R.id.txtMessage);
        EditText editTxtName = findViewById(R.id.editTxtName);
        txtMessage.setText("Welcome to the app " + editTxtName.getText().toString());
    }
}