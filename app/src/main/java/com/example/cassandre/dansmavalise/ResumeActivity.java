package com.example.cassandre.dansmavalise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cassandre.dansmavalise.Model.Voyage;

public class ResumeActivity extends AppCompatActivity {

    private TextView destination;
    private TextView dateVoyage;
    private TextView nbjours;
    private TextView sexe;
    private TextView saison;
    private TextView categories;
    private TextView listeVetements;
    private TextView placesToBe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        destination = (TextView) findViewById(R.id.activity_resume_destination);
        dateVoyage = (TextView) findViewById(R.id.activity_resume_datevoyage);
        nbjours = (TextView) findViewById(R.id.activity_resume_nbjours);
        sexe = (TextView) findViewById(R.id.activity_resume_sexe);
        saison = (TextView) findViewById(R.id.activity_resume_saison);
        categories = (TextView) findViewById(R.id.activity_resume_categorieVetements);
        listeVetements = (TextView) findViewById(R.id.activity_resume_listeVetements);
        placesToBe = (TextView) findViewById(R.id.activity_resume_endroitsAVisiter);

        if (Contexte.getInstance().getVoyageCourant() == null){
            Toast.makeText(this, getString(R.string.VoyageCourantNull), Toast.LENGTH_LONG)
                    .show();
            return;
        }

        destination.setText(Contexte.getInstance().getVoyageCourant().getDestination().getNom());
        dateVoyage.setText(Contexte.getInstance().getVoyageCourant().getDateDepart() +
                "-" +
                Contexte.getInstance().getVoyageCourant().getDateFin());
        nbjours.setText(String.valueOf(Contexte.getInstance().getVoyageCourant().getNbJours()) +
                " " +
                getString(R.string.jours));
        sexe.setText(Contexte.getInstance().getVoyageCourant().getSexe().name());
        saison.setText(Contexte.getInstance().getVoyageCourant().getSaison().name());
        categories.setText(Contexte.getInstance().getVoyageCourant().getCategoriesString());
        listeVetements.setText(Contexte.getInstance().getVoyageCourant().getVetementsString());
        placesToBe.setText(Contexte.getInstance().getVoyageCourant().getPlacesToBeString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Contexte.getInstance().initVoyage();
    }


}
