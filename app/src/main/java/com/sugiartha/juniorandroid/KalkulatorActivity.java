package com.sugiartha.juniorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    EditText angka1, angka2;
    Button btnPlus, btnMinus, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        angka1 = (EditText) findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnPlus.setOnClickListener(new Button.OnClickListener() {
            @Override public void onClick(View v) {
                double angkasatu = Double.parseDouble(angka1.getText().toString());
                double angkadua = Double.parseDouble(angka2.getText().toString());
                double result = angkasatu + angkadua;
                txtHasil.setText(Double.toString(result));
            }});

        btnMinus.setOnClickListener(new Button.OnClickListener() {
            @Override public void onClick(View v) {
                double angkasatu = Double.parseDouble(angka1.getText().toString());
                double angkadua = Double.parseDouble(angka2.getText().toString());
                double result = angkasatu - angkadua;
                txtHasil.setText(Double.toString(result));
            }});

        btnKali.setOnClickListener(new Button.OnClickListener() {
            @Override public void onClick(View v) {
                double angkasatu = Double.parseDouble(angka1.getText().toString());
                double angkadua = Double.parseDouble(angka2.getText().toString());
                double result = angkasatu * angkadua;
                txtHasil.setText(Double.toString(result));
            }});

        btnBagi.setOnClickListener(new Button.OnClickListener() {
            @Override public void onClick(View v) {
                double angkasatu = Double.parseDouble(angka1.getText().toString());
                double angkadua = Double.parseDouble(angka2.getText().toString());
                double result = angkasatu / angkadua;
                txtHasil.setText(Double.toString(result));
            }});
    }
}
