package com.example.appnov26;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Lab3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);

        Button lab3_thevenin = (Button) findViewById(R.id.lab3_thevenin);
        lab3_thevenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab3_thevenin = new Intent(getApplicationContext(), TheveninDiagram.class);
                startActivity(lab3_thevenin);
            }
        });

        Button lab3_vir = (Button) findViewById(R.id.lab3_vir);
        lab3_vir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab3_vir = new Intent(getApplicationContext(), VIR.class);
                startActivity(lab3_vir);
            }
        });
    }

}
