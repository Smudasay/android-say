package com.android.applicationtemperature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private TextView tv1;
    private String scal1, scal2;
    private double cal1, cal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        tv1 = findViewById(R.id.tv1);

    }

    public void C2F(View view) {

        EditText edt1 = (EditText) findViewById(R.id.edt1);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        String sedt1 = edt1.getText().toString();
        if (TextUtils.isEmpty(sedt1)) {
            edt1.setError("Please Enter Number");
        } else {
            double cal1 = Double.parseDouble(String.valueOf(edt1.getText()));
            //double cal1 = Double.parseDouble (edt1.getText ().toString ());
            cal1 = (cal1 * (9.0 / 5.0)) + 32;

            tv1.setText(cal1 + " Fahrenheit");
        }
    }

    public void F2C(View view) {
        String sedt2 = edt1.getText().toString();
        if (TextUtils.isEmpty(sedt2)) {
            edt1.setError("Please Enter Number");
        } else {
            double cal2 = Double.parseDouble(String.valueOf(edt1.getText()));
            //double cal2= Double.parseDouble (edt1.getText ().toString ());
            cal2 = (cal2 - 32) * (5.0 / 9.0);

            tv1.setText(cal2 + " Celsius");
        }

    }
}