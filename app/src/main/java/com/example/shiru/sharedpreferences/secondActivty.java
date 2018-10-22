package com.example.shiru.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
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

    //Loading data from Application level SharedPref file
    public void loadAccountData(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() +Constants.PREF_FILE_NAME, Context.MODE_PRIVATE);

        String name = sharedPreferences.getString(Constants.KEY_NAME, "Null");
        String city = sharedPreferences.getString(Constants.KEY_CITY, "Null");

        txtSecondName.setText(name);
        txtSecondCity.setText(city);
    }

    public void clearAccountData(View view) {
    }

    public void removeProffessionKey(View view) {
    }
}
