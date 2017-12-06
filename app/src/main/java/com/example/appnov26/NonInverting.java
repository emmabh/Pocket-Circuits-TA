package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;

public class NonInverting extends AppCompatActivity {
    private EditText ni_input1;
    private EditText ni_input2;
    private EditText ni_input3;
    private TextView ni_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_inverting);
        ni_input1 = (EditText) findViewById(R.id.ni_input1);
        ni_input2 = (EditText) findViewById(R.id.ni_input2);
        ni_input3 = (EditText) findViewById(R.id.ni_input3);

        Button ni_calculate=(Button) findViewById(R.id.ni_calculate);
        ni_result = (TextView) findViewById(R.id.ni_result);
        ni_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                makeNICalculations();
            }
        });
    }
    private void makeNICalculations(){
        double n1;
        double n2;
        double n3;
        double result;

        boolean isnotfilled1 = isEmpty(ni_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(ni_input2.getText().toString().trim());
        boolean isnotfilled3 = isEmpty(ni_input3.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;
        int nf3 = (isnotfilled3) ? 1 : 0;

        if(nf2+nf3 != 0){
            ni_result.setText("Fill both resistance values");
        }
        else{

            n2 = Double.valueOf(ni_input2.getText().toString());
            n3 = Double.valueOf(ni_input3.getText().toString());
            if(n2 == 0)
                ni_result.setText("R1 cannot be zero");
            else if(nf1==1){
                result = 1+ n3/n2;
                ni_result.setText(String.format("Gain: %.3f",result));
            }
            else{
                n1 = Double.valueOf(ni_input1.getText().toString());
                result = 1+ n3/n2;
                double voutresult = n1*result;
                ni_result.setText(String.format("Gain: %.3f",result) + String.format("\nVout: %.3f",voutresult," V"));
            }

        }

    }

}