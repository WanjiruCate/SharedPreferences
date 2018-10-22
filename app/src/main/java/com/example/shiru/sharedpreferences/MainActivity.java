package com.example.shiru.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtname,txtcity;
    TextInputEditText etName,etCity;
   Button btnSave,btnLoad,btnNext;
   Switch aSwitch;
   LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.linearlayout);

        etName = findViewById(R.id.etxtName);
        etCity = findViewById(R.id.etxtCity);

        btnSave = findViewById(R.id.btnSave);
        btnLoad = findViewById(R.id.btnLoad);
        btnNext = findViewById(R.id.btnNext);

        aSwitch = findViewById(R.id.switchbtn);

        txtcity = findViewById(R.id.txtCity);
        txtname = findViewById(R.id.txtName);

    }

    public void saveData(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName()+Constants.PREF_FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(Constants.KEY_NAME,etName.getText().toString());
        editor.putString(Constants.KEY_CITY,etCity.getText().toString());

        editor.apply(); //editor.commit()


    }

    public void loadData(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() +Constants.PREF_FILE_NAME, Context.MODE_PRIVATE);

        String name = sharedPreferences.getString(Constants.KEY_NAME, "Null");
        String city = sharedPreferences.getString(Constants.KEY_CITY, "Null");

        txtname.setText(name);
        txtcity.setText(city);



    }

    public void openSecondActivity(View view) {

        Intent intent = new Intent(this,secondActivty.class);
        startActivity(intent);
    }
}
