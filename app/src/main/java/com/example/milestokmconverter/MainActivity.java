package com.example.milestokmconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonMtoK = (Button)findViewById(R.id.buttonMtoK);
        Button buttonKtoM = (Button)findViewById(R.id.buttonKtoM);
        Button buttonclose = findViewById(R.id.buttonClose);
        buttonMtoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxMiles = findViewById(R.id.TextMile);
                EditText textboxKm = findViewById(R.id.TextKm);
                double vMiles = Double.valueOf(textboxMiles.getText().toString());
                double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textboxKm.setText(formatVal.format(vKm));
            }
        });

        buttonKtoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxMiles = findViewById(R.id.TextMile);
                EditText textboxKm = findViewById(R.id.TextKm);
                double vKm = Double.valueOf(textboxKm.getText().toString());
                double vMIles = vKm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textboxMiles.setText(formatVal.format(vMIles));
            }
        });
        buttonclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}