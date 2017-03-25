package com.example.cassandre.dansmavalise.Database;

import java.util.ArrayList;

/**
 * Created by aschaal on 25/03/2017.
 */

public class Service {
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
}
