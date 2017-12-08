package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.text.TextUtils.isEmpty;

public class Inverting extends AppCompatActivity {
    private EditText i_input1;
    private EditText i_input2;
    private EditText i_input3;
    private TextView i_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverting);
        i_input1 = (EditText) findViewById(R.id.i_input1);
        i_input2 = (EditText) findViewById(R.id.i_input2);
        i_input3 = (EditText) findViewById(R.id.i_input3);

        Button i_calculate=(Button) findViewById(R.id.i_calculate);
        i_result = (TextView) findViewById(R.id.i_result);
        i_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                makeICalculations();
            }
        });
    }
    private void makeICalculations(){
        double n1;
        double n2;
        double n3;
        double result;

        boolean isnotfilled1 = isEmpty(i_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(i_input2.getText().toString().trim());
        boolean isnotfilled3 = isEmpty(i_input3.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;
        int nf3 = (isnotfilled3) ? 1 : 0;

        if(nf2+nf3 != 0){
            i_result.setText("Fill both resistance values");
        }
        else{

            n2 = Double.valueOf(i_input2.getText().toString());
            n3 = Double.valueOf(i_input3.getText().toString());
            if(n2 == 0)
                i_result.setText("R1 cannot be zero");
            else if(nf1==1){
                result = -n3/n2;
                DecimalFormat df = new DecimalFormat("#.#########");
                result= Double.valueOf(df.format(result));
                i_result.setText("Gain: "+result);
            }
            else{
                n1 = Double.valueOf(i_input1.getText().toString());
                result = -n3/n2;
                double voutresult = n1*result;
                DecimalFormat df = new DecimalFormat("#.#########");
                result= Double.valueOf(df.format(result));
                voutresult= Double.valueOf(df.format(voutresult));
                i_result.setText("Gain: "+result+"\nVout: "+voutresult +" V");
            }

        }

    }

}