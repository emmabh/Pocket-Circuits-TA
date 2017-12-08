package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.text.TextUtils.isEmpty;

public class VoltageDivider extends AppCompatActivity {
    private EditText vd_input1;
    private EditText vd_input2;
    private EditText vd_input3;
    private TextView vd_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voltage_divider);
        vd_input1 = (EditText) findViewById(R.id.vd_input1);
        vd_input2 = (EditText) findViewById(R.id.vd_input2);
        vd_input3 = (EditText) findViewById(R.id.vd_input3);

        Button vd_calculate=(Button) findViewById(R.id.vd_calculate);
        vd_result = (TextView) findViewById(R.id.vd_result);
        vd_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){makeVDCalculations();}
        });
    }

    private void makeVDCalculations() {
        double R1;
        double R2;
        double V;
        double V1;
        double V2;


        boolean isnotfilled1 = isEmpty(vd_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(vd_input2.getText().toString().trim());
        boolean isnotfilled3 = isEmpty(vd_input3.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;
        int nf3 = (isnotfilled3) ? 1 : 0;


        if (nf1 != 0) {
            vd_result.setText("Resistance 1 Needed");
        } else if (nf2 != 0) {
            vd_result.setText("Resistance 2 Needed");
        } else if (nf3 != 0) {
            vd_result.setText("Voltage Value Needed");
        } else {
            R1 = Double.valueOf(vd_input1.getText().toString());
            R2 = Double.valueOf(vd_input2.getText().toString());
            V = Double.valueOf(vd_input3.getText().toString());
            double denom = R1 + R2;
            if (R1 == 0) {
                DecimalFormat df = new DecimalFormat("#.#########");
                V= Double.valueOf(df.format(V));
                vd_result.setText("Vout = " + V + " Volts");
            } else if (R2 == 0) {
                V1 = (R1 / denom) * V;
                V2 = 0;
                vd_result.setText("Vout = " + V2 + " Volts");
            } else {
                V2 = (R2 / denom) * V;
                DecimalFormat df = new DecimalFormat("#.#########");
                V2= Double.valueOf(df.format(V2));
                vd_result.setText("Vout = "+ V2 + " Volts");
            }
        }


    }
}
