package com.company;

/**
 * Created by Colm on 18/11/2015.
 */
public class ContainsFristXThenNextIsX {

    boolean doubleX(String str) {

        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        String x = str.substring(i);
        System.out.println(x);
        return x.startsWith("xx");
    }
}
