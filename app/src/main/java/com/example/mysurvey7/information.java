package com.example.mysurvey7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class information extends AppCompatActivity implements View.OnClickListener {

    private EditText Date,NometPrénom,Datedenaissance,Niveaudétudes,Profession,Lieuderésidence;
    private Button btn1;
    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Date = (EditText)findViewById(R.id.date);
        NometPrénom = (EditText)findViewById(R.id.name);
        Datedenaissance = (EditText)findViewById(R.id.birthday);
        Niveaudétudes = (EditText)findViewById(R.id.grade);
        Profession = (EditText)findViewById(R.id.profession);
        Lieuderésidence = (EditText)findViewById(R.id.place);

      Button = findViewById(R.id.btn1);
    }

    @Override
    public void onClick(View v) {

    }
}