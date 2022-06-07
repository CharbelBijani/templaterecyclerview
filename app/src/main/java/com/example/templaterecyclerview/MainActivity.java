package com.example.templaterecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /* variables globales */

    RecyclerView recyclerView;
    String[] descriptions;

    private String[] stagiaires = new String[]{
            "Nelson",
            "Charbel",
            "Hicham",
            "Walid",
            "Antoine",
            "Nassir",
            "Ben",
            "Sonia",
            "Ons",
            "Anh Hoang",
            "Samuel"
    };


    int avatars[] = {
        R.drawable.stagiaire_01,
        R.drawable.stagiaire_02,
        R.drawable.stagiaire_03,
        R.drawable.stagiaire_04,
        R.drawable.stagiaire_05,
        R.drawable.stagiaire_06,
        R.drawable.stagiaire_07,
        R.drawable.stagiaire_08,
        R.drawable.stagiaire_09,
        R.drawable.stagiaire_010,
        R.drawable.stagiaire_011
    };

    /* Méthode d'initialisation des widgets */
    private void initUI(){
            recyclerView= findViewById(R.id.id_recyclerView);

            //initialisation des donnees
            descriptions = getResources().getStringArray(R.array.description);
    }

    /* methode pour le fonctionnement de l'appli  */

            private void remplissageRecycler(){
                RecyclerAdapter adapter = new RecyclerAdapter(this,
                        stagiaires, descriptions, avatars);

                recyclerView.setAdapter(adapter);

                LinearLayoutManager layoutManager = new LinearLayoutManager(
                        this,
                        LinearLayoutManager.VERTICAL,
                        false);

                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setHasFixedSize(true);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        remplissageRecycler();


    }
}