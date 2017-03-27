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
    public enum TypeCategorie{
        pluie,
        ski,
        soleil,
        principal,
        professionnelle,
        froid,
        none
    }

    public static TypeCategorie ConvertCategorie(String value){
        switch (value){
            case "froid":
                return TypeCategorie.froid;
            case "accessoiresPrincipaux":
                return TypeCategorie.principal;
            case "ski":
                return TypeCategorie.ski;
            case "soleil":
                return TypeCategorie.soleil;
            case "professionnelle":
                return TypeCategorie.professionnelle;
            case "pluie":
                return TypeCategorie.pluie;
            default:
                return TypeCategorie.none;
        }
    }
    public enum Temps{
        Ete,
        Printemps,
        Hiver,
        Automne
    }
}
