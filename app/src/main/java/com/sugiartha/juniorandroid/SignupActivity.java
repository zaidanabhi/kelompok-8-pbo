package com.sugiartha.juniorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {

    Spinner spin;
    String spin_val;
    String[] gender = { "Laki-Laki", "Perempuan" };
    //array of strings used to populate the spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button buttonpindah = findViewById(R.id.buttonpindah);
        buttonpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        spin = (Spinner) findViewById(R.id.spinner_id);//fetching view's id
        // Register a callback to be invoked when an item in this AdapterView has been selected
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int  position, long id) {
                // TODO Auto-generated method stub
                spin_val = gender[position];//saving the value selected
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });//setting array adaptors to spinners
        // ArrayAdapter is a BaseAdapter that is backed by an array of arbitrary objects

        ArrayAdapter<String> spin_adapter = new ArrayAdapter<String>(SignupActivity.this, android.R.layout.simple_spinner_item, gender);
        // setting adapters to spinners
        spin.setAdapter(spin_adapter);
    }
}
