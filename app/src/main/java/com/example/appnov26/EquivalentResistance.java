package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;

public class EquivalentResistance extends AppCompatActivity {
    private EditText eqr_input1;
    private EditText eqr_input2;
    private TextView eqr_tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equivalent_resistance);
        Intent intenteqr = getIntent();
        eqr_input1 = (EditText) findViewById(R.id.et_eqr_input1);
        eqr_input2 = (EditText) findViewById(R.id.et_eqr_input2);

        Button bt_paral_calculate=(Button) findViewById(R.id.bt_paral_calculate);
        Button bt_series_calculate=(Button) findViewById(R.id.bt_series_calculate);
        eqr_tv_result = (TextView) findViewById(R.id.eqr_tv_result);
        bt_paral_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                makeCalculations();
            }
        });
        bt_series_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                makeCalculationsseries();
            }
        });
    }
    private void makeCalculations(){
        double n1;
        double n2;
        double result;

        boolean isnotfilled1 = isEmpty(eqr_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(eqr_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if(nf1+nf2 != 0){
            eqr_tv_result.setText("Two Resistances Needed");
        }
        else {
            n1=Double.valueOf(eqr_input1.getText().toString());
            n2=Double.valueOf(eqr_input2.getText().toString());
            if(n1==0||n2==0){
                eqr_tv_result.setText("Eq. Resistance = 0.0 Ohms");
            }
            else{
                double intermediate_result = 1/n1+1/n2;
                result = 1/intermediate_result;
                eqr_tv_result.setText(String.format("Eq. Resistance = %.3f",result," Ohms"));
            }
        }
    }


    private void makeCalculationsseries(){
        double n1;
        double n2;
        double result;

        boolean isnotfilled1 = isEmpty(eqr_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(eqr_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if(nf1+nf2 != 0){
            eqr_tv_result.setText("Two Resistances Needed");
        }
        else {
            n1=Double.valueOf(eqr_input1.getText().toString());
            n2=Double.valueOf(eqr_input2.getText().toString());
            result = n1+n2;

            eqr_tv_result.setText(String.format("Eq. Resistance = %.3f",result," Ohms"));
        }
    }
}