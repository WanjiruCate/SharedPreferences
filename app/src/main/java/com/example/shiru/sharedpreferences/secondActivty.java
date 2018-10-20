package com.example.shiru.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivty extends AppCompatActivity {

    TextView txtSecondName, txtSecondCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);

        txtSecondCity = findViewById(R.id.txtCitySecond);
        txtSecondName = findViewById(R.id.txtNameSecond);
    }

    public void loadAccountData(View view) {
    }

    public void clearAccountData(View view) {
    }

    public void removeProffessionKey(View view) {
    }
}
