package com.example.cassandre.dansmavalise.Model;

import com.example.cassandre.dansmavalise.Enum.Enums;

/**
 * Created by aschaal on 27/03/2017.
 */

public class Categorie {
    private int id;
    private Enums.TypeCategorie nom;

    public Categorie(int id, String nom){
        this.id = id;
        this.nom = Enums.ConvertCategorie(nom);
    }

    public int getId(){
        return id;
    }
}
