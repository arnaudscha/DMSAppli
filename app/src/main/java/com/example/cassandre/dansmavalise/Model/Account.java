package com.example.cassandre.dansmavalise.Model;

import com.example.cassandre.dansmavalise.Enum.Enums;

import java.util.ArrayList;

/**
 * Created by aschaal on 04/04/2017.
 */

public class Account {
    private int id;
    private String nom;
    private Enums.Sexe sexe;
    private int age;
    private String adresse;
    private ArrayList<Voyage> voyages;

    public Account(){
    }

    public Account(int id, String nom, Enums.Sexe sexe, int age, String adresse, ArrayList<Voyage> voyages){
        this.id = id;
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.adresse = adresse;
        this.voyages = voyages;
    }

    public static Account getInstanceVide(){
        return new Account(0, "null", Enums.Sexe.unisexe, 0, "null", new ArrayList<Voyage>());
    }

    public void ajouterVoyage(Voyage v){
        voyages.add(v);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Voyage> getVoyages() {
        return voyages;
    }
}
