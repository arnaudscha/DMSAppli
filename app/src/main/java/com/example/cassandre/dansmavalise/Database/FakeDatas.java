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
        InitVilles();
        IniPlacesToBe();
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

    public static void InitCategories(){
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

    public static void InitVilles(){
        Villes = new ArrayList<ArrayList<String>>();
        ArrayList<String> data = new ArrayList<String>();
        int i  = 0;

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Paris");
        Villes.add(data);

        data.clear();//0
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Lyon");
        Villes.add(data);

        data.clear();//1
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Lilles");
        Villes.add(data);

        data.clear();//2
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Bordeaux");
        Villes.add(data);

        data.clear();//3
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Biarritz");
        Villes.add(data);

        data.clear();//4
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Marseille");
        Villes.add(data);

        data.clear();//5
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Lourdes");
        Villes.add(data);

        data.clear();//6
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Saint Tropez");
        Villes.add(data);


        data.clear();//7
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Toulouse");
        Villes.add(data);

        data.clear();//8
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Porto Vecio");
        Villes.add(data);

        data.clear();//9
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Carcassone");
        Villes.add(data);

        data.clear();//10
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Deauville");
        Villes.add(data);

        data.clear();//11
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Nantes");
        Villes.add(data);

        data.clear();//12
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Val d'Isère");
        Villes.add(data);

        data.clear();//13
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Font Romeau");
        Villes.add(data);

        data.clear();//14
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Strasbourg");
        Villes.add(data);

        data.clear();//15
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Reims");
        Villes.add(data);

        data.clear();//16
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Bayonne");
        Villes.add(data);

        data.clear();//17
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Dunkerque");
        Villes.add(data);

        data.clear();//18
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Mont Saint Michel");
        Villes.add(data);

        data.clear();//19
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Ile de Ré");
        Villes.add(data);

        data.clear();//20
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Clermont Ferrant");
        Villes.add(data);

        data.clear();//21
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Guadeloupe");
        Villes.add(data);
    }

    public static void IniPlacesToBe(){
        PlacesToBe = new ArrayList<ArrayList<String>>();
        ArrayList<String> data = new ArrayList<String>();
        int i  = 0;

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Omelette de la mère Poulard");
        data.add(2, "18");
        data.add(3, "On vous recommande d'aller manger une délicieuse omelette.");
        data.add(4, "décontracté");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Bastion");
        data.add(2, "19");
        data.add(3, "La boite de nuit à ne pas manquer.");
        data.add(4, "soirée");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "La folie Douce");
        data.add(2, "12");
        data.add(3, "Entre deux pistes, un incontournable !");
        data.add(4, "décontractée");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Casino");
        data.add(2, "10");
        data.add(3, "Pour boire juste un verre ou jouer au poker.");
        data.add(4, "soirée");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "R2 Rooftop");
        data.add(2, "4");
        data.add(3, "Un petit coin de paradis.");
        data.add(4, "soirée");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Grotte de Lourdes");
        data.add(2, "5");
        data.add(3, "LE lieu à visiter.");
        data.add(4, "décontractée/Marche");
        Categories.add(data);

        data.clear();
        data.add(0, String.valueOf(i)); i++;
        data.add(1, "Café de Flore");
        data.add(2, "1");
        data.add(3, "Une brasserie typique de Paris, située au coeur de Saint Germain.");
        data.add(4, "décontractée");
        Categories.add(data);
    }
}
