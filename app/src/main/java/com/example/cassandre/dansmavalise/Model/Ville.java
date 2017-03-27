package com.example.cassandre.dansmavalise.Model;

import java.util.ArrayList;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Ville {

    private int id;
    private String nom;
    private ArrayList<PlaceToBe> placesToBe;

    public Ville(int id, String nom){
        this.placesToBe = new ArrayList<PlaceToBe>();
        this.id = id;
        this.nom = nom;
    }

    public int getId(){
        return id;
    }

    public void setPlacesToBe(ArrayList<PlaceToBe> value){
        this.placesToBe = value;
    }
}
