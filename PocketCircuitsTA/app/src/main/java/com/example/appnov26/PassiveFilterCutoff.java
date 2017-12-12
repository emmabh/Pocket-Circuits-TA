package com.example.appnov26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.text.TextUtils.isEmpty;

public class PassiveFilterCutoff extends AppCompatActivity {
    private EditText pff_input1;
    private EditText pff_input2;
    private TextView pff_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passive_filter_cutoff);
        pff_input1 = (EditText) findViewById(R.id.pff_input1);
        pff_input2 = (EditText) findViewById(R.id.pff_input2);

        Button pff_calculate = (Button) findViewById(R.id.pff_calculate);
        pff_result = (TextView) findViewById(R.id.pff_result);
        pff_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePFFCalculations();
            }
        });
    }
    private void makePFFCalculations(){
        double n1;
        double n2;
        double result;

        boolean isnotfilled1 = isEmpty(pff_input1.getText().toString().trim());
        boolean isnotfilled2 = isEmpty(pff_input2.getText().toString().trim());
        int nf1 = (isnotfilled1) ? 1 : 0;
        int nf2 = (isnotfilled2) ? 1 : 0;

        if(nf1+nf2 != 0){
            pff_result.setText("Two Values Needed");
        }
        else {
            n1=Double.valueOf(pff_input1.getText().toString());
            n2=Double.valueOf(pff_input2.getText().toString());
            if(n1==0)
                pff_result.setText("Resistance cannot be zero");
            else if(n2==0)
                pff_result.setText("Capacitance cannot be zero");
            else{
                double intermediateresult = n1*n2;
                result = 1/intermediateresult;
                double fresult = result/2/Math.PI;
                DecimalFormat df = new DecimalFormat("#.#########");
                fresult= Double.valueOf(df.format(fresult));
                result= Double.valueOf(df.format(result));
                pff_result.setText("w: "+result+" radians\nf: "+fresult+" Hertz" );
            }
        }
    }
}
