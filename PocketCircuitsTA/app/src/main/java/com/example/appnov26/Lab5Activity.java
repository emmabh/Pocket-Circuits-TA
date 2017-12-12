package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);

        Button lab5_inverting= (Button) findViewById(R.id.lab5_inverting);
        lab5_inverting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab5_invertingintent = new Intent(getApplicationContext(), Inverting.class);
                startActivity(lab5_invertingintent);
            }

        });
        Button lab5_noninverting= (Button) findViewById(R.id.lab5_noninverting);
        lab5_noninverting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab5_noninvertingintent = new Intent(getApplicationContext(), NonInverting.class);//change to non
                startActivity(lab5_noninvertingintent);
            }

        });

        Button diagram= (Button) findViewById(R.id.diagram);
        diagram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent diagram = new Intent(getApplicationContext(), OpAmpDiagram.class);//change to non
                startActivity(diagram);
            }

        });
    }
}
