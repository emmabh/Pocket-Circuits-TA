package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7);
        Button lab7_timeconstant = (Button) findViewById(R.id.lab7_timeconstant);
        lab7_timeconstant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab7_timeconstantintent = new Intent(getApplicationContext(), TimeConstant.class);
                startActivity(lab7_timeconstantintent);
            }

        });
        Button lab7_timeconstantrl = (Button) findViewById(R.id.lab7_timeconstantrl);
        lab7_timeconstantrl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab7_timeconstantRLintent = new Intent(getApplicationContext(), TimeConstantRL.class);
                startActivity(lab7_timeconstantRLintent);
            }

        });
    }
}
