package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Lab0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab0);
        Intent intent0 = getIntent();

        Button lab0_multimeter = (Button) findViewById(R.id.lab0_multimeter);
        lab0_multimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab0_multimeter = new Intent(getApplicationContext(), Multimeter.class);
                startActivity(lab0_multimeter);
            }
        });

        Button lab0_pwr = (Button) findViewById(R.id.lab0_pwr);
        lab0_pwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab0_pwr = new Intent(getApplicationContext(), PowerSource.class);
                startActivity(lab0_pwr);
            }
        });

        Button lab0_vir = (Button) findViewById(R.id.lab0_vir);
        lab0_vir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab0_vir = new Intent(getApplicationContext(), VIR.class);
                startActivity(lab0_vir);
            }
        });
    }
}
