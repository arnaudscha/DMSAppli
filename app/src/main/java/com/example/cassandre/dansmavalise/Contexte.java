package com.example.cassandre.dansmavalise;

import com.example.cassandre.dansmavalise.Database.Service;
import com.example.cassandre.dansmavalise.Enum.Enums;
import com.example.cassandre.dansmavalise.Model.Account;
import com.example.cassandre.dansmavalise.Model.Voyage;
import java.util.Date;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Contexte {

    private static Contexte instance;

    private Contexte(){
        accountCourant = Service.getSingleton().getAccount("Ursula");
    }

    public static Contexte getInstance(){
        if(instance == null){
            instance = new Contexte();
        }
        return instance;
    }

    private Voyage voyageCourant;
    private Account accountCourant;

    public void creerNouveauVoyage(String destination, Date dateDepart, Date dateFin, Enums.Sexe sexe){
        voyageCourant = new Voyage(
                Service.getSingleton().getVille(destination),
                dateDepart,
                dateFin,
                sexe
        );
    }

    public Voyage getVoyageCourant(){
        return voyageCourant;
    }

    public void initVoyage() {
        voyageCourant = null;
    }

    public Account getAccountCourant() { return accountCourant; }

    public void ajouterVoyageCourant() {
        accountCourant.ajouterVoyage(voyageCourant);

        //TODO : Dans le cas d'un appel serveur gerer l'initialisation du voyage courant dans le callback.
        initVoyage();
    }
}
