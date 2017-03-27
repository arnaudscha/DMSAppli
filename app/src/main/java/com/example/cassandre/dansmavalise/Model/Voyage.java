package com.example.cassandre.dansmavalise.Model;

import android.widget.ArrayAdapter;

import com.example.cassandre.dansmavalise.Database.Service;
import com.example.cassandre.dansmavalise.Enum.Enums;
import com.example.cassandre.dansmavalise.Tools.Tools;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Voyage {



    private Date dateDepart;
    private Date dateFin;
    private Enums.Temps saison;
    private Ville destination;
    private ArrayList<Vetement> vetements;
    private Enums.Sexe sexe;
    private int nbJours;

    public Voyage(){

    }

    public Voyage(Ville ville, Date dateDepart, Date dateFin, Enums.Sexe sexe){
        this.destination = ville;
        this.dateDepart = dateDepart;
        this.dateFin = dateFin;
        this.sexe = sexe;
        this.nbJours = (int)Math.abs((dateDepart.getTime() - dateFin.getTime())/ (24 * 60 * 60 * 1000));
        this.saison = Tools.getSaison(dateDepart);
        this.vetements = Service.getSingleton().getVetements(destination.getCategories());
    }

    public String getDateDepart(){
        return Tools.formatDate(dateDepart);
    }

    public String getDateFin(){
        return Tools.formatDate(dateFin);
    }

    public Enums.Temps getSaison(){
        return saison;
    }
}
