package com.example.cassandre.dansmavalise.Model;

import com.example.cassandre.dansmavalise.Enum.Enums;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Voyage {

    private Date dateDepart;
    private Date dateFin;
    private Enums.Temps saison;
    private Ville destination;
    private ArrayList<Vetement> vetements;
    private Categorie categorie;
    private Enums.Sexe sexe;

    public Voyage(){

    }

    public Voyage(Ville ville, Date dateDepart, Date dateFin, Enums.Sexe sexe){
        this.destination = ville;
        this.dateDepart = dateDepart;
        this.dateFin = dateFin;
        this.sexe = sexe;
    }
}
