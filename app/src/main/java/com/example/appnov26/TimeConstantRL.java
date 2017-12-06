package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;

public class TimeConstantRL extends AppCompatActivity {
    private EditText rl_input1;
    private EditText rl_input2;
    private TextView rl_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_constant_rl);
        rl_input1 = (EditText) findViewById(R.id.rl_input1);
        rl_input2 = (EditText) findViewById(R.id.rl_input2);

        Button rl_calculate = (Button) findViewById(R.id.rl_calculate);
        rl_result = (TextView) findViewById(R.id.rl_result);
        rl_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeRLCalculations();
            }
        });
    }
    private void makeRLCalculations(){
        double n1;
        double n2;
        double result;

        boolean isnotfilled1 = isEmpty(rl_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(rl_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if(nf1+nf2 != 0){
            rl_result.setText("Two Values Needed");
        }
        else {
            n1=Double.valueOf(rl_input1.getText().toString());
            n2=Double.valueOf(rl_input2.getText().toString());
            if(n1==0){
                rl_result.setText("Resistance cannot be zero");
            }
            else{
                result = n2/n1;
                rl_result.setText(String.format("Time constant: %.3f",result) + " seconds");
            }
        }
    }
}
