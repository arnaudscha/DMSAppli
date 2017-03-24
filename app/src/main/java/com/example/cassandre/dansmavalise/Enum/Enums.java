package com.example.cassandre.dansmavalise.Enum;

/**
 * Created by aschaal on 24/03/2017.
 */

public class Enums {
    public enum Sexe{
        Homme,
        Femme,
        unisexe,
    };

    public static Sexe ConvertSexe(String value){
        switch (value){
            case "f":
                return Sexe.Femme;
            case "h":
                return Sexe.Homme;
            default:
                return Sexe.unisexe;
        }
    }
    public enum Categorie{
        pluie,
        ski,
        soleil,
        principal,
        professionnelle,
        froid,
        none
    }

    public static Categorie ConvertCategorie(String value){
        switch (value){
            case "froid":
                return Categorie.froid;
            case "accessoiresPrincipaux":
                return Categorie.principal;
            case "ski":
                return Categorie.ski;
            case "soleil":
                return Categorie.soleil;
            case "professionnelle":
                return Categorie.professionnelle;
            case "pluie":
                return Categorie.froid;
            default:
                return Categorie.none;
        }
    }
    public enum Temps{
        Ete,
        Printemps,
        Hiver,
        Automne
    }
}
