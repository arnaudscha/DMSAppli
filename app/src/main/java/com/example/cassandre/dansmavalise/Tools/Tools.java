package com.example.cassandre.dansmavalise.Tools;

import com.example.cassandre.dansmavalise.Enum.Enums;

import java.text.DateFormat;
import java.util.Date;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by aschaal on 25/03/2017.
 */

public class Tools {
    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
    }

    private static Date now = new Date();
    private static Date debutPrintemps = new Date(now.getYear(), 3, 19);
    private static Date debutEte = new Date(now.getYear(), 6, 21);
    private static Date debutAutomne = new Date(now.getYear(), 9, 22);
    private static Date debutHiver = new Date(now.getYear(), 12, 21);

    public static Enums.Temps getSaison(Date dateDepart)
    {
        if(dateDepart.after(debutPrintemps) && dateDepart.before(debutEte)){
            return Enums.Temps.Printemps;
        }
        if(dateDepart.after(debutEte) && dateDepart.before(debutAutomne)){
            return Enums.Temps.Ete;
        }
        if(dateDepart.after(debutAutomne) && dateDepart.before(debutHiver)){
            return Enums.Temps.Automne;
        }
        if(dateDepart.after(debutHiver) && dateDepart.before(debutPrintemps)){
            return Enums.Temps.Hiver;
        }
        return Enums.Temps.Automne;
    }

    private static DateFormat dformat = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);

    public static String formatDate(Date date){
        return dformat.format(date);
    }
}
