package de.neuefische;

import java.util.*;
public class Main {
    //    Überprüfe erst die Länge des Passworts und
    //    dann, ob Zahlen enthalten sind
    public static void main(String[] args) {
        System.out.println(checkPasswordLength("something"));
        System.out.println(checkIfContainsNumber("7"));
    }

    public static int checkPasswordLength(String password) {
        int length = password.length();
        return length;
    }

    public static boolean checkIfContainsNumber(String password) {
        boolean trueFalse = false;
        char[] nums0to9 = {'0','1','2','3','4','5','6','7','8','9'};
        char[] sc = password.toCharArray();
            for (int i = 0; i < sc.length; i++){
                for (int p = 0; p < nums0to9.length; p++)
                if (sc[i] == nums0to9[p]){
                    trueFalse = true;
                }
            }
        return trueFalse;
    }
}