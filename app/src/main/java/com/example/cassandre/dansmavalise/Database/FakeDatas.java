package com.example.cassandre.dansmavalise.Database;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aschaal on 24/03/2017.
 */

//A voir si l'on ne peux pas remplacer cette classe par une vrai base de données (e.g. : SQLLite).
public class FakeDatas {
    public static ArrayList<ArrayList<String>> Villes;
    public static ArrayList<ArrayList<String>> Vetements;
    public static ArrayList<ArrayList<String>> PlacesToBe;
    public static ArrayList<ArrayList<String>> Categories;

    public static void InitDatabase() {
        InitVetements();
        InitCategories();
        Villes = new ArrayList<ArrayList<String>>();
        PlacesToBe = new ArrayList<ArrayList<String>>();
    }

    public static void InitVetements(){
        Vetements = new ArrayList<ArrayList<String>>();
        ArrayList<String> data = new ArrayList<String>();
        int i  = 0;

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "pull chaud");
        data.add(2, "5");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "pled");
        data.add(2, "5");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "bouillote");
        data.add(2, "5");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "costume");
        data.add(2, "4");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "malette");
        data.add(2, "4");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "cravate");
        data.add(2, "4");
        data.add(3, "h");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "bijoux");
        data.add(2, "4");
        data.add(3, "f");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "tee-shirt");
        data.add(2, "3");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "pull");
        data.add(2, "3");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "pantalon");
        data.add(2, "3");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "jupe");
        data.add(2, "3");
        data.add(3, "f");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "robe");
        data.add(2, "3");
        data.add(3, "f");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "short");
        data.add(2, "3");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "culottes");
        data.add(2, "3");
        data.add(3, "f");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "caleçons");
        data.add(2, "3");
        data.add(3, "h");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "maillot de bain");
        data.add(2, "2");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "creme solaire");
        data.add(2, "2");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "chapeau");
        data.add(2, "2");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "lunette de soleil");
        data.add(2, "2");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "sandales");
        data.add(2, "2");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "chapeau");
        data.add(2, "2");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "bonnet");
        data.add(2, "1");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "écharpes");
        data.add(2, "1");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "gants");
        data.add(2, "1");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "matériel de ski");
        data.add(2, "1");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "doudoune");
        data.add(2, "1");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "écharpes");
        data.add(2, "1");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "k-way");
        data.add(2, "0");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "bottes de pluie");
        data.add(2, "0");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "foulard");
        data.add(2, "0");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "bottes de pluie");
        data.add(2, "0");
        data.add(3, "uni");
        Vetements.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "brosse à dents");
        data.add(2, "3");
        data.add(3, "uni");
        Vetements.add(data);
        //pluie = 0 ; ski = 1 ; soleil = 2 ; accessoiresP = 3 ; professionnelle = 4 ; froid  = 5 ;
    }

    public static  void InitCategories(){
        Categories = new ArrayList<ArrayList<String>>();
        ArrayList<String> data = new ArrayList<String>();
        int i  = 0;
        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "pluie");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "ski");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "soleil");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "accessoiresPrincipaux");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "professionnelle");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "froid");
        Categories.add(data);
    }
}
