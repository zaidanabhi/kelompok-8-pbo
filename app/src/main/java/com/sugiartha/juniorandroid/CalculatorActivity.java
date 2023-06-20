package com.sugiartha.juniorandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class CalculatorActivity extends AppCompatActivity {

    //Deklarasi variable
    Button btnHapus, btnPersen, btnBagi, btnKali, btnKurang, btnTambah, btnSamaDengan,
            btnTitik, btnNol, btnSatu, btnDua, btnTiga, btnEmpat, btnLima, btnEnam, btnTujuh,
            btnDelapan, btnSembilan;
    String proses;
    ImageView btnBackspace;
    TextView angkaMasuk, angkaKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //getSupportActionBar().setTitle("");

        btnNol = findViewById(R.id.btnNol);
        btnSatu = findViewById(R.id.btnSatu);
        btnDua = findViewById(R.id.btnDua);
        btnTiga = findViewById(R.id.btnTiga);
        btnEmpat = findViewById(R.id.btnEmpat);
        btnLima = findViewById(R.id.btnLima);
        btnEnam = findViewById(R.id.btnEnam);
        btnTujuh = findViewById(R.id.btnTujuh);
        btnDelapan = findViewById(R.id.btnDelapan);
        btnSembilan = findViewById(R.id.btnSembilan);

        btnHapus = findViewById(R.id.btnHapus);
        btnBackspace = (ImageView) findViewById(R.id.btnBackspace);
        btnPersen = findViewById(R.id.btnPersen);
        btnBagi = findViewById(R.id.btnBagi);
        btnKali = findViewById(R.id.btnKali);
        btnKurang = findViewById(R.id.btnKurang);
        btnTambah = findViewById(R.id.btnTambah);
        btnSamaDengan = findViewById(R.id.btnSamaDengan);
        btnTitik = findViewById(R.id.btnTitik);

        angkaMasuk = findViewById(R.id.angkaMasuk);
        angkaKeluar = findViewById(R.id.angkaKeluar);

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaMasuk.setText("");
                angkaKeluar.setText("");
            }
        });

        btnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "0");
            }
        });

        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "1");
            }
        });

        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "2");
            }
        });

        btnTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "3");
            }
        });

        btnEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "4");
            }
        });

        btnLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "5");
            }
        });

        btnEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "6");
            }
        });

        btnTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "7");
            }
        });

        btnDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "8");
            }
        });

        btnSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "9");
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "+");
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "-");
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "x");
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "/");
            }
        });

        btnTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + ".");
            }
        });

        btnPersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "%");
            }
        });

        btnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();
                angkaMasuk.setText(proses + "0");
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = angkaMasuk.getText().toString();
                int input = word.length();
                if(input > 0) {
                    angkaMasuk.setText(word.substring(0, input - 1));
                }
            }
        });

        btnSamaDengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses = angkaMasuk.getText().toString();

                proses = proses.replaceAll("x", "*");
                proses = proses.replaceAll("%", "/100");

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initSafeStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,proses, "javascript", 1, null).toString();
                }catch (Exception e){
                    finalResult = "0";
                }

                angkaKeluar.setText(finalResult);
            }
        });
    }
}
