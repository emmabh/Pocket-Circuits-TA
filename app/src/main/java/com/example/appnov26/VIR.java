package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.text.TextUtils.isEmpty;

public class VIR extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vir);
        input1 = (EditText) findViewById(R.id.et_input1);
        input2 = (EditText) findViewById(R.id.et_input2);
        input3 = (EditText) findViewById(R.id.et_input3);

        Button bt_calculate=(Button) findViewById(R.id.bt_calculate);
        tv_result = (TextView) findViewById(R.id.tv_result);
        bt_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                makeCalculations();
            }
        });
    }
    private void makeCalculations(){
        double n1;
        double n2;
        double result;

        boolean isnotfilled1 = isEmpty(input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(input2.getText().toString().trim());
        boolean isnotfilled3 = isEmpty(input3.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;
        int nf3 = (isnotfilled3) ? 1 : 0;

        if(nf1+nf2+nf3 != 1){
            tv_result.setText("Fill 2 out of 3 elements.");
        }
        else if(isnotfilled1){
            n1 = Double.valueOf(input2.getText().toString());
            n2 = Double.valueOf(input3.getText().toString());
            result = n1*n2;
            DecimalFormat df = new DecimalFormat("#.#########");
            result= Double.valueOf(df.format(result));
            tv_result.setText("Voltage: "+ result+" V");

        }
        else if(isnotfilled2){
            n1 = Double.valueOf(input1.getText().toString());
            n2 = Double.valueOf(input3.getText().toString());
            if(n2==0){
                tv_result.setText("Resistance cannot be zero.");
            }
            else{
                result = n1/n2;
                DecimalFormat df = new DecimalFormat("#.#########");
                result= Double.valueOf(df.format(result));
                tv_result.setText("Current: "+result +" A");
            }

        }
        else if(isnotfilled3){
            n1 = Double.valueOf(input1.getText().toString());
            n2 = Double.valueOf(input2.getText().toString());
            if(n2==0){
                tv_result.setText("Current cannot be zero.");
            }
            else {
                result = n1 / n2;
                if(n1<0&&n2>0)
                {
                    tv_result.setText("Voltage and current must match sign");
                }
                else
                {
                    DecimalFormat df = new DecimalFormat("#.#########");
                    result= Double.valueOf(df.format(result));
                    tv_result.setText("Resistance: "+ result+ " Ohms");
                }
            }
        }


    }

}