package com.engim.lezione9.calcolatriceHInversa;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Scanner;


public class Calcolatrice {

    static ArrayList<Double> pila;

    public static double pop(){
        double n = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return n;
    }

    public static void addizione(){
        if(pila.size()>= 2){
            double n2 = pop();
            double n1 = pop();

            aggiuntaNum(n1+n2);
        }
    }

    public static void sottrazione(){

    }

    public static void moltiplicazione(){

    }

    public static void divisione(){

    }

    public static void aggiuntaNum(double num){
        pila.add(num);
    }

    public static void finito(){
        if()
    }



    public static void main(String[] args) {
        pila = new ArrayList<>();
        System.out.println("Benvenuto nella calcolatrice con H inversa. Inserisci una espressione con notazione H inversa: ");
        Scanner keyboard = new Scanner(System.in);

        while(keyboard.hasNext()){
            String input = keyboard.next();
            switch (input){
                case "+":
                    addizione();
                    break;
                case "-":
                    sottrazione();
                    break;
                case "*":
                    moltiplicazione();
                    break;
                case "/":
                    divisione();
                    break;
                case "=":
                    System.out.println(pila);
                    break;
                case "E":
                    finito = true;
                    break;
                default:
                    aggiuntaNum(Double.parseDouble(input));

            }
        }

    }
}
