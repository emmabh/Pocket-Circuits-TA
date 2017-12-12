package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.text.TextUtils.isEmpty;

public class TimeConstant extends AppCompatActivity {
    private EditText rc_input1;
    private EditText rc_input2;
    private TextView rc_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_constant);
        rc_input1 = (EditText) findViewById(R.id.rc_input1);
        rc_input2 = (EditText) findViewById(R.id.rc_input2);

        Button rc_calculate = (Button) findViewById(R.id.rc_calculate);
        rc_result = (TextView) findViewById(R.id.rc_result);
        rc_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeRCCalculations();
            }
        });
    }
    private void makeRCCalculations(){
        double n1;
        double n2;
        double result;

        boolean isnotfilled1 = isEmpty(rc_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(rc_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if(nf1+nf2 != 0){
            rc_result.setText("Two Values Needed");
        }
        else {
            n1=Double.valueOf(rc_input1.getText().toString());
            n2=Double.valueOf(rc_input2.getText().toString());
            result = n1*n2;
            DecimalFormat df = new DecimalFormat("#.#########");
            result= Double.valueOf(df.format(result));
            rc_result.setText("Time constant: "+result + " seconds");
        }
    }
}
