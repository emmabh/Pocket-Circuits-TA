package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lab0 = (Button) findViewById(R.id.buttonlab0);
        lab0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab0intent = new Intent(getApplicationContext(), Lab0Activity.class);
                startActivity(lab0intent);
            }

        });
        Button lab1 = (Button) findViewById(R.id.buttonlab1);
        lab1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab1intent = new Intent(getApplicationContext(), Lab1Activity.class);
                startActivity(lab1intent);
            }

        });
        Button lab2 = (Button) findViewById(R.id.buttonlab2);
        lab2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab2intent = new Intent(getApplicationContext(), Lab2Activity.class);
                startActivity(lab2intent);
            }

        });
        Button lab3 = (Button) findViewById(R.id.buttonlab3);
        lab3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab3intent = new Intent(getApplicationContext(), Lab3Activity.class);
                startActivity(lab3intent);
            }

        });

        Button lab4 = (Button) findViewById(R.id.buttonlab4);
        lab4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab4intent = new Intent(getApplicationContext(), Lab4Activity.class);
                startActivity(lab4intent);
            }

        });

        Button lab5 = (Button) findViewById(R.id.buttonlab5);
        lab5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab5intent = new Intent(getApplicationContext(), Lab5Activity.class);
                startActivity(lab5intent);
            }

        });

        Button lab6 = (Button) findViewById(R.id.buttonlab6);
        lab6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab6intent = new Intent(getApplicationContext(), Lab6Activity.class);
                startActivity(lab6intent);
            }

        });

        Button lab7 = (Button) findViewById(R.id.buttonlab7);
        lab7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab7intent = new Intent(getApplicationContext(), Lab7Activity.class);
                startActivity(lab7intent);
            }

        });
        Button lab8 = (Button) findViewById(R.id.buttonlab8);
        lab8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab8intent = new Intent(getApplicationContext(), Lab8Activity.class);
                startActivity(lab8intent);
            }

        });
        Button lab9 = (Button) findViewById(R.id.buttonlab9);
        lab9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab9intent = new Intent(getApplicationContext(), Lab9Activity.class);
                startActivity(lab9intent);
            }

        });
    }
}
