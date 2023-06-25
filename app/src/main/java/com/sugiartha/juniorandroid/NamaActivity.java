package com.sugiartha.juniorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class NamaActivity extends AppCompatActivity {

    Button btnOk;
    EditText editNama;
    TextView txtHasil;

    ImageView greencheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        btnOk = (Button) findViewById(R.id.btnOk);
        editNama = (EditText) findViewById(R.id.editNama);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        greencheck = (ImageView) findViewById(R.id.greencheck);
        btnOk.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHasil.setText("Hello " + editNama.getText().toString()
                        + "!\nPeserta VSGA" + "");
                greencheck.setVisibility(View.VISIBLE);
                greencheck.setImageResource(R.drawable.nonrepeatcheck);
            }
        });
    }
}
