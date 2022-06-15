package com.example.mysurvey7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    int NbP = 100;
    int NbQ = 50;

    public static ArrayList<Questions> listOfQ;

    Button button;
    Button button3;
    Button button2;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), information.class);
                startActivity(intent);
                    }
                });
        Button button3 = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QST2.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),information.class);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DashBoardActivity.class);
                startActivity(intent);
            }
        });



        listOfQ=new ArrayList<>();
        int numpation;

        Questions[] Q = new Questions[15];
        for (int i=0;i<=15;i++)

        Q[0] = new Questions("Q1P1-N'importe quel type de pain","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[1] = new Questions("Q1P2-Pain au son(avec ou sans sel)","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[2] = new Questions("Q1P3-Pain à la farine,baguette,morceau de pain de mie","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[3] = new Questions("Q1P4-Mlawi,Msemen,Ghrayef,Batbout,Matloua","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[4] = new Questions("Q1P5-Pain d'el harcha","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[5] = new Questions("Q1P6-Pain de maison(khobz dar)","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[6] = new Questions("Q1P7-Autres type de pain(mais,orge..)","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");
        Q[7] = new Questions("Q1P8-Pain à la nigelle/sésame","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour", "Pain");

        Q[9] = new Questions("Q2P1-Tout type de céréales","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[10] = new Questions("Q2P2- Assida","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[11] = new Questions("Q2P3-Son de blé(noukhala)","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[12] = new Questions("Q2P4-Corne flakes","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[13] = new Questions("Q2P5-Dchicha/Orge(au lait)","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[14] = new Questions("Q2P6-Un morceau de pain","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[15] = new Questions("Q2P7-Biscuit","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");
        Q[16] = new Questions("Q2P8-Viennoiserie","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","Petit déjeuner");

        Q[17] = new Questions("Q3P1-Couscous à la viande rouge et légumes","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","couscous");
        Q[18] = new Questions("Q3P2-Couscous poulet et légumes","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","couscous");
        Q[19] = new Questions("Q3P3-Mesfouf au sucre/dattes/raisins secs","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","couscous");
        Q[20] = new Questions("Q3P4-Mesfouf au Lben","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","couscous");

        Q[21] = new Questions("Q4P1-Tout type de pates","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");
        Q[22] = new Questions("Q4P2-Pates normales(spaghetti,macaroni) au blé","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");
        Q[23] = new Questions("Q4P3-Les pates normales à l'orge","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");
        Q[24] = new Questions("Q4P4-Les pates à la viande,fromage,légumes","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");
        Q[25] = new Questions("Q4P5-Les pates à la créme fraiche","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");
        Q[26] = new Questions("Q4P6-Vermicelle et petit plombs,Lssan Ettir..","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");
        Q[27] = new Questions("Q4P7-Indomi","jamais/rarement","1-3 fois/mois","1 fois/semaine","2-4 fois/semaine","5-6 fois/semaine","1 fois/jour","2-3 fois/jour","4 fois ou+/jour","pate");


        listOfQ.add(new Questions("question","a","b","c","d","e",
                "f","g","h","section"));
        listOfQ.add(Q[0]);
        listOfQ.add(Q[2]);
        listOfQ.add(Q[3]);
        listOfQ.add(Q[4]);
        listOfQ.add(Q[5]);
        listOfQ.add(Q[6]);
        listOfQ.add(Q[7]);


        int choices[][] = new int[NbQ][NbP];
        for(int i=0;i<=40;i++)
            for(int j=0;j<=100;j++)
                choices[i][j] = -1;


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
             Intent intent = new Intent(MainActivity.this, DashBoardActivity.class);
             startActivity(intent);
         }

        }; delayMillis:1500);
    }


}