package com.example.templaterecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nomStagiaire = findViewById(R.id.id_tvNomStagiaire);
        TextView description = findViewById(R.id.id_tvDescription);
        ImageView avatar = findViewById(R.id.id_ivImageSeule);


        Intent intent = getIntent();
        String stagiaire = intent.getStringExtra("stagiaire");
        String desc = intent.getStringExtra("desc");
        String savatar = intent.getStringExtra("avatar");

        nomStagiaire.setText(stagiaire);
        description.setText(desc);
        avatar.setImageResource(Integer.parseInt(savatar));

    }


}