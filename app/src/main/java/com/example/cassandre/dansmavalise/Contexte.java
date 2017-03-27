package com.example.cassandre.dansmavalise;

import com.example.cassandre.dansmavalise.Database.Service;
import com.example.cassandre.dansmavalise.Enum.Enums;
import com.example.cassandre.dansmavalise.Model.Voyage;
import java.util.Date;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Contexte {

    private static Contexte instance;

    private Contexte(){

    }

    public static Contexte getInstance(){
        if(instance == null){
            instance = new Contexte();
        }
        return instance;
    }

    private Voyage voyageCourant;

    public void creerNouveauVoyage(String destination, Date dateDepart, Date dateFin, Enums.Sexe sexe){
        voyageCourant = new Voyage(
                Service.getSingleton().getVille(destination),
                dateDepart,
                dateFin,
                sexe
        );


    }
}
