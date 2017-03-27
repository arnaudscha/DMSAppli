package com.example.cassandre.dansmavalise.Model;

/**
 * Created by aschaal on 27/03/2017.
 */

public class PlaceToBe {
    private int id;
    private String nom;
    private Ville ville;
    private String description;
    private String tenueRecommandee;

    public PlaceToBe(int id, String nom, Ville ville, String description, String tenueRecommandee){
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.tenueRecommandee = tenueRecommandee;
    }
}
