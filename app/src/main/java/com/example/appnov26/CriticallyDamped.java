package com.example.appnov26;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;
import static java.lang.Math.sqrt;

public class CriticallyDamped extends AppCompatActivity {

    private EditText cd_input1;
    private EditText cd_input2;
    private TextView cd_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_critically_damped);
        cd_input1 = (EditText) findViewById(R.id.cd_input1);
        cd_input2 = (EditText) findViewById(R.id.cd_input2);

        Button vd_calculate = (Button) findViewById(R.id.cd_calculate);
        cd_result = (TextView) findViewById(R.id.cd_result);
        vd_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeCDCalculations();
            }
        });
    }

    private void makeCDCalculations() {
        double R;
        double L;
        double C;

        boolean isnotfilled1 = isEmpty(cd_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(cd_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if (nf1 != 0) {
            cd_result.setText("Inductance Needed");
        } else if (nf2 != 0) {
            cd_result.setText("Capacitance Needed");
        } else {
            L = Double.valueOf(cd_input1.getText().toString());
            C = Double.valueOf(cd_input2.getText().toString());
            if (L == 0 || C == 0) {
                cd_result.setText("Critically damped R= 0.0 Ohms");
            } else {
                R = sqrt((4 * L) / C);
                cd_result.setText(String.format("Critically damped R = %.3f", R) + " Ohms");
            }
        }


    }

}