package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8);
        Button lab8_criticallydamped= (Button) findViewById(R.id.lab8_criticallydamped);
        lab8_criticallydamped.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab8_criticallydamped = new Intent(getApplicationContext(), CriticallyDamped.class);
                startActivity(lab8_criticallydamped);

            }
        });
    }

}
