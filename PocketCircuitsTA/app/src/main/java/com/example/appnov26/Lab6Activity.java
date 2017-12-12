package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6);

        Button lab6_arduino= (Button) findViewById(R.id.lab6_arduino);
        lab6_arduino.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab6_arduinointent = new Intent(getApplicationContext(), LaunchPad.class);//change to non
                startActivity(lab6_arduinointent);
            }

        });

    }
}
