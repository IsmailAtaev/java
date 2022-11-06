package com.ataev.model.check;


/**
 * @author Ataev Ismayll
 * class Check intended for check String and Integer.
 * All methods static.
 * I things, what is use thread then will bad ideas or call methods for static. :-)
 * */

public class Check {

    /**
     * Check value na zero, null and  number fort integer.
     */
    public static boolean isNumber(String number) {
        return !number.equals("") && number != null && number.matches("\\d+?");
    }

    //TODO bad method for else return zero very bad
    /**
     * @return Integer.parseInt(string)
     * @throws NumberFormatException
     **/
    public static int getNumber(String number) {
        if (Check.isNumber(number))
            return Integer.parseInt(number);
        return 0;
    }

    /**
     * Check value zero and null.
     */
    public static boolean isString(String str) {
        return !str.equals("") && str != null;
    }
}