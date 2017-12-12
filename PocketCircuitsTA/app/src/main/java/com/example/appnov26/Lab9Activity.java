package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab9);
        Button lab9_pfcutoff= (Button) findViewById(R.id.lab9_pfcutoff);
        lab9_pfcutoff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lab9_pfcutoffintent = new Intent(getApplicationContext(), PassiveFilterCutoff.class);
                startActivity(lab9_pfcutoffintent);
            }

        });
    }
}
