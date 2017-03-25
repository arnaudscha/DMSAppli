package com.example.cassandre.dansmavalise.Database;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

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
}
