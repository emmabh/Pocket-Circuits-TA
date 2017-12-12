package com.example.appnov26;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class OpAmpMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_amp_main);

        Button inverting = (Button) findViewById(R.id.OpAmp_Inverting);
        inverting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent invertingintent = new Intent(getApplicationContext(), Inverting.class);
                startActivity(invertingintent);
            }

        });
        Button noninverting = (Button) findViewById(R.id.OpAmp_NonInverting);
        noninverting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent noninvertingintent = new Intent(getApplicationContext(), NonInverting.class);
                startActivity(noninvertingintent);
            }

        });
    }

}
