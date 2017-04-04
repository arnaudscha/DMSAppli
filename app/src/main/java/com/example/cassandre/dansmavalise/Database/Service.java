package com.example.cassandre.dansmavalise.Database;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.widget.ArrayAdapter;

import com.example.cassandre.dansmavalise.Enum.Enums;
import com.example.cassandre.dansmavalise.Model.Account;
import com.example.cassandre.dansmavalise.Model.Categorie;
import com.example.cassandre.dansmavalise.Model.PlaceToBe;
import com.example.cassandre.dansmavalise.Model.Vetement;
import com.example.cassandre.dansmavalise.Model.Ville;
import com.example.cassandre.dansmavalise.Model.Voyage;
import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by aschaal on 25/03/2017.
 */

public class Service {
    private static String googleMapAPI = "AIzaSyChyvCs9Q3HBdcGqrp-9fSct75NkFthb5Y";
    private static Service instance = null;

    private Service(){

    }

    public static Service getSingleton(){
        if(instance == null){
            instance = new Service();
        }
        return instance;
    }

    public ArrayList<String> getArrayStringPays(String value){
        ArrayList<String> result = new ArrayList<String>();

        for(ArrayList<String> d : FakeDatas.Villes){
            if(d.get(1).contains(value)){
                result.add(d.get(1));
            }
        }

        return result;
    }

    public boolean checkLocation(String value){
        boolean result = false;
        for(ArrayList<String> d : FakeDatas.Villes){
            if(d.get(1).toLowerCase().equals(value.toLowerCase())){
                result = true;
                break;
            }
        }
        return result;
    }

    public LatLng getLocationFromAddress(Context context, String strAddress) {
        Geocoder coder = new Geocoder(context);
        List<Address> address;
        LatLng p1 = null;

        try {
            // May throw an IOException
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            location.getLatitude();
            location.getLongitude();

            p1 = new LatLng(location.getLatitude(), location.getLongitude() );

        } catch (IOException ex) {

            ex.printStackTrace();
        }

        return p1;
    }

    public Ville getVille(String value){
        Ville result = null;

        for(ArrayList<String> v : FakeDatas.Villes){
            if(v.get(1).toLowerCase().equals(value.toLowerCase())){

                result = new Ville(
                        convertID(v.get(0)),
                        v.get(1),
                        convertID(v.get(3))
                );

                result.setPlacesToBe(getPlacesToBe(result));
                ArrayList<Categorie> categories = new ArrayList<Categorie>();
                for (String s : v.get(2).split("-")){
                    int i = convertID(s);
                    if(i != -1){
                        categories.add(getCategories(i));
                    }
                }
                result.setCategories(categories);
                break;
            }
        }

        return result;
    }

    private Categorie getCategories(int id){
        Categorie result = null;

        for(ArrayList<String> c : FakeDatas.Categories){
            if(id == convertID(c.get(0))){
                result = new Categorie(
                        convertID(c.get(0)),
                        c.get(1)
                );
                break;
            }
        }
        return result;
    }

    private ArrayList<PlaceToBe> getPlacesToBe(Ville ville){
        ArrayList<PlaceToBe> result = new ArrayList<PlaceToBe>();

        for(ArrayList<String> v : FakeDatas.PlacesToBe) {
            if(convertID(v.get(2)) == ville.getId()){
                result.add(new PlaceToBe(
                        convertID(v.get(0)),
                        v.get(1),
                        ville,
                        v.get(3),
                        v.get(4)
                ));
            }
        }
        return result;
    }

    public ArrayList<Vetement> getVetements(int id, Enums.Sexe sexe){
        ArrayList<Vetement> result = new ArrayList<Vetement>();

        for (ArrayList<String> v : FakeDatas.Vetements){
            if(convertID(v.get(2)) == id &&
                (Enums.ConvertSexe(v.get(3)).equals(sexe) ||
                 Enums.ConvertSexe(v.get(3)).equals(Enums.Sexe.unisexe)) ) {
                result.add(new Vetement(
                        convertID(v.get(0)),
                        v.get(1))
                );
            }
        }

        return result;
    }

    public ArrayList<Vetement> getVetements(ArrayList<Categorie> categories, Enums.Sexe sexe){
        ArrayList<Vetement> result = new ArrayList<Vetement>();

        for (Categorie c : categories){
            result.addAll(getVetements(c.getId(), sexe));
        }
        return result;
    }

    public Account getAccount(String name){
        Account result = null;

        for(ArrayList<String> a : FakeDatas.Accounts){
            if(a.get(1).equals(name)){
                //int id, String nom, Enums.Sexe sexe, int age, String adresse, ArrayList<Voyage> voyages
                result = new Account(
                        convertID(a.get(0)),
                        a.get(1),
                        Enums.ConvertSexe(a.get(2)),
                        convertID(a.get(3)),
                        a.get(4),
                        new ArrayList<Voyage>()
                );
            }
        }

        if(result == null){
            result = Account.getInstanceVide();
        }

        return result;
    }

    public int convertID(String value){
        int result = -1;
        result  = Integer.decode(value);
        return result;
    }
}
