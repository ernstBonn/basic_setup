package de.neuefische;

import java.util.*;
public class Main {
    //    Überprüfe erst die Länge des Passworts und
    //    dann, ob Zahlen enthalten sind
    public static void main(String[] args) {
        System.out.println(checkPasswordLength("something"));
        System.out.println(checkIfContainsNumber("7"));
        System.out.println(checkIfCapitalOrNot("pAssword", false));
    }

    public static int checkPasswordLength(String password) {
        int length = password.length();
        return length;
    }

    public static boolean checkIfContainsNumber(String password) {
        boolean trueFalse = false;
        char[] nums0to9 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] sc = password.toCharArray();
        for (int i = 0; i < sc.length; i++) {
            for (int p = 0; p < nums0to9.length; p++)
                if (sc[i] == nums0to9[p]) {
                    trueFalse = true;
                }
        }
        return trueFalse;
    }
    public static boolean checkIfCapitalOrNot(String password, boolean meIsCapital) {
        boolean trueFalse = false;
        char[] sc = password.toCharArray();
        if(meIsCapital == true){
            for (int i = 0; i < sc.length; i++) {
                if (Character.isUpperCase(sc[i])) {
                    trueFalse = true;
                    break;
                }
                else {
                    trueFalse = false;
                }
            }
        }
        else {
            for (int i = 0; i < sc.length; i++) {
                if (Character.isUpperCase(sc[i])) {
                    trueFalse = false;
                    break;
                }
                else {
                    trueFalse = true;
                }
            }
        }
        return trueFalse;
    }
}