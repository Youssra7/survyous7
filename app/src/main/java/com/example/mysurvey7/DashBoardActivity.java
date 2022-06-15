package com.example.mysurvey7;

import static com.example.mysurvey7.MainActivity.listOfQ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Collections;
import java.util.List;

public class DashBoardActivity extends AppCompatActivity {

    List<Questions> allQuestionsList;
    Questions questions;
    int index=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        allQuestionsList = listOfQ;
        Collections.shuffle(allQuestionsList);
        questions =listOfQ.get(index);

    }
}