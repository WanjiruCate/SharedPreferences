package com.example.shiru.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    //Delete all account data from shared preferences
    public void clearAccountData(View view) {

        SharedPreferences preferences = getSharedPreferences(getPackageName()+Constants.PREF_FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.clear();
        editor.apply();

        Toast.makeText(getApplicationContext(),"Cleared shared Preferences",Toast.LENGTH_LONG).show();
    }

    public void removeProffessionKey(View view) {

        SharedPreferences preferences = getSharedPreferences(getPackageName()+Constants.PREF_FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.remove(Constants.KEY_CITY);
        editor.apply();

        Toast.makeText(getApplicationContext(),"Removed"+Constants.KEY_CITY+ " shared Preferences",Toast.LENGTH_LONG).show();
    }
}
