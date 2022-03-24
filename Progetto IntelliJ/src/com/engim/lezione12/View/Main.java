package com.engim.lezione12.View;

import com.engim.lezione12.Controller.ListaSpesaController;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static ListaSpesaController controller;

    public static void main(String[] args) {
        controller = new ListaSpesaController();
        System.out.println("Benvenuto nel programma Lista della spesa");

        boolean finito = false;
        Scanner keyboard = new Scanner(System.in);

        while (!finito) {

            System.out.println("Cosa vuoi fare? \n" +
                    "1. Leggere i nomi delle liste \n" +
                    "2. Aggiungere una lista \n" +
                    "3. Cancellare una lista \n" +
                    "4. Leggere il contenuto di una lista \n" +
                    "5. Aggiungere un elemento ad una lista \n" +
                    "6. Rimuovere un elemento da una lista");

            String risposta = keyboard.nextLine();
            switch (risposta) {
                case "1":
                    nomiliste();
                    break;
                case "2":
                    aggiungiLista(keyboard);
                    break;
                case "3":
                    cancellaLista(keyboard);
                    break;
                case "4":
                    leggiLista(keyboard);
                    break;
                case "5":
                    aggiungiElem(keyboard);
                    break;
                case "6":
                    rimuoviElem(keyboard);
                    break;
                default:
                    System.out.println("Hai sbagliato ad inserire!");
            }
        }
    }

    private static void rimuoviElem(Scanner keyboard) {
        System.out.println("Inserisci il nome della lista");
        String lista = keyboard.nextLine();
        System.out.println("Inserisci il nome dell'elemento");
        String elem = keyboard.nextLine();
        if(controller.removeElemToLista(lista,elem))
            System.out.println("Ok");
        else{
            System.out.println("Error");
        }
    }

    private static void aggiungiElem(Scanner keyboard) {
        System.out.println("Inserisci il nome della lista");
        String lista = keyboard.nextLine();
        System.out.println("Inserisci il nome dell'elemento");
        String elem = keyboard.nextLine();
        if(controller.addElemToLista(lista, elem))
            System.out.println("Ok");
        else{
            System.out.println("Error");
        }
    }

    private static void leggiLista(Scanner keyboard) {
        System.out.println("Quale lista vuoi leggere? (inserire il nome della lista)");
        String risposta = keyboard.nextLine();
        List<String> elementi = controller.readLista(risposta);
        for(String element : elementi) {
            System.out.println(element);
        }
    }

    private static void cancellaLista(Scanner keyboard) {
        System.out.println("Quale lista vuoi cancellare? (inserire il nome della lista)");
        String risposta = keyboard.nextLine();
        if(controller.removeLista(risposta))
            System.out.println("Ok");
        else{
            System.out.println("Lista non esistente!");
        }
    }

    private static void aggiungiLista(Scanner keyboard) {
        System.out.println("Che nome vuoi dare a questa lista?");
        String risposta = keyboard.nextLine();
        if (controller.setNomeLista(risposta))
            System.out.println("Ok");
        else {
            System.out.println("Lista già esistente!");
        }
    }

    private static void nomiliste() {
        for (String liste : controller.getNomiListe()) {
            System.out.println(liste);
        }
    }
}
