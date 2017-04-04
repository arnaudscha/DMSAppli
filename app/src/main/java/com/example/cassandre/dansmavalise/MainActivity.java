package com.example.cassandre.dansmavalise;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cassandre.dansmavalise.Adapter.MainVoyageAdapter;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private Button startTravel;
    private TextView nom;
    private RecyclerView voyages;
    private RecyclerView.Adapter voyagesAdapter;
    private RecyclerView.LayoutManager voyagesLayoutManager;
    private View noVoyages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On instancie les elements graphiques et on fait les retouches graphiques
        initGraphicElements();
    }

    private void initGraphicElements(){
        //startTravel = (Button) findViewById(R.id.activity_main_startTravel);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        voyages = (RecyclerView) findViewById(R.id.activity_main_listVoyages);
        noVoyages = (View) findViewById(R.id.activity_main_novoyages);

        if(Contexte.getInstance().getAccountCourant().getVoyages().size() > 0){
            noVoyages.setVisibility(View.GONE);
            voyages.setVisibility(View.VISIBLE);
        }
        voyages.setHasFixedSize(true);
        //On set le layout manager.
        voyagesLayoutManager = new LinearLayoutManager(this);
        voyages.setLayoutManager(voyagesLayoutManager);
        //On set l'adapter.
        voyagesAdapter = new MainVoyageAdapter(this, Contexte.getInstance().getAccountCourant().getVoyages());
        voyages.setAdapter(voyagesAdapter);

        //Ici, on indique l'action a faire suite au click du bouton "Commencer un nouveau voyage."
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewTravel();
            }
        };
        //startTravel.setOnClickListener(listener);
        fab.setOnClickListener(listener);
    }

    private void startNewTravel(){
        Intent i = new Intent(MainActivity.this,
                NewTravelActivity.class);
        startActivity(i);
    }
}
