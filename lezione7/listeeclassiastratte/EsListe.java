package com.engim.lezione7.listeeclassiastratte;

public class EsListe {
    public static void main(String[] args) {
        Nil nil = new Nil();
        List lista = new Node(new Node(new Node(nil,1),2),3);
        System.out.println(lista.get(2));
        //lista.add(0,4);
        System.out.println(lista);
        System.out.println(lista.length());
        lista = lista.add(3,10);
        System.out.println(lista);
        System.out.println(lista.length());

        //lista = lista.removeIndex(1);
        //lista = lista.removeIndex(1);
        System.out.println(lista);

        lista = lista.remove(3);
        System.out.println(lista);

    }
}
