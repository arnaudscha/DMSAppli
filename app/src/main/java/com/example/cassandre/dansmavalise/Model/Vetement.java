package com.example.cassandre.dansmavalise.Model;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Vetement {
    private int id;
    private String nom;

    public Vetement(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
