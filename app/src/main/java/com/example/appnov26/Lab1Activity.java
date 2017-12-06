package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        Intent intent1 = getIntent();
        Button lab1VIR = (Button) findViewById(R.id.lab1_vir);
        lab1VIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab1VIRintent = new Intent(getApplicationContext(), VIR.class);
                startActivity(lab1VIRintent);
            }
        });

        Button lab1LED = (Button) findViewById(R.id.lab1_led);
        lab1LED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab1LEDintent = new Intent(getApplicationContext(), LEDDiagram.class);
                startActivity(lab1LEDintent);
            }
        });

        Button lab1multi = (Button) findViewById(R.id.lab1_multimeter);
        lab1multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab1multiintent = new Intent(getApplicationContext(), Multimeter.class);
                startActivity(lab1multiintent);
            }
        });

        Button bread = (Button) findViewById(R.id.bread);
        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent breadintent = new Intent(getApplicationContext(), BreadBoard.class);
                startActivity(breadintent);
            }
        });
    }
}