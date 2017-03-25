package com.example.cassandre.dansmavalise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startTravel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On instancie les elements graphiques et on fait les retouches graphiques
        initGraphicElements();
    }

    private void initGraphicElements(){
        startTravel = (Button) findViewById(R.id.activity_main_startTravel);

        //Ici, on indique l'action a faire suite au click du bouton "Commencer un nouveau voyage."
        startTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewTravel();
            }
        });
    }

    private void startNewTravel(){
        Intent i = new Intent(MainActivity.this,
                NewTravelActivity.class);
        startActivity(i);
    }
}
