package com.example.cassandre.dansmavalise.Tools;

import java.util.Arrays;

/**
 * Created by aschaal on 25/03/2017.
 */

public class Tools {
    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
    }
}
