package com.sugiartha.juniorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LingkaranActivity extends AppCompatActivity {

    Button btnkliling, btnluas;
    EditText jari2;
    TextView hslkll, hslluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        btnkliling = (Button) findViewById(R.id.btnkliling);
        btnluas = findViewById(R.id.btnluas);
        jari2 = (EditText) findViewById(R.id.jari2);
        hslkll = (TextView) findViewById(R.id.hslkll);
        hslluas = findViewById(R.id.hslluas);


        // HITUNG KELILING
        btnkliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jari2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LingkaranActivity.this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double radius = Double.parseDouble(jari2.getText().toString());
                    double phi = 3.14;
                    double keliling = 2 * phi * radius;
                    hslkll.setText(String.valueOf(keliling));
                }
            }
        });

        // HITUNG LUAS
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jari2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LingkaranActivity.this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    double radius = Double.parseDouble(jari2.getText().toString());
                    double phi = 3.14;
                    double luas = phi * radius * radius;
                    hslluas.setText(String.valueOf(luas));
                }
            }
        });

    }
}
