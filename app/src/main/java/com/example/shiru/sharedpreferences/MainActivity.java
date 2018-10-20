package com.example.shiru.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   EditText etName,etCity;
   Button btnSave,btnLoad,btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.txtName);
        etCity = findViewById(R.id.txtCity);


    }

    public void saveData(View view) {
    }

    public void loadData(View view) {
    }

    public void openSecondActivity(View view) {
    }
}
