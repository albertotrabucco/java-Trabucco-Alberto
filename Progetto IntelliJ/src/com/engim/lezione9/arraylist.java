package com.engim.lezione9;

import java.util.ArrayList;

public class arraylist {

    public static void main(String args[]) {


        ArrayList<String> lista1 = new ArrayList<>();

        lista1.add("ciao");
        lista1.add("Hello");

        lista1.add("WE");

        for (String elem : lista1) {
            System.out.println(elem + " ");
        }

        lista1.remove(1);

        for (String elem : lista1) {
            System.out.println(elem + " ");
        }
    }
}