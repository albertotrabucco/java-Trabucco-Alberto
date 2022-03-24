package com.engim.lezione12.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListSpesaRepository implements SpesaRepository {

    private static SpesaRepository instance;
    private Map<String, Lista> liste;

    private ArrayListSpesaRepository() {
        instance = this;
        liste = new HashMap<>();
    }

    public static SpesaRepository getInstance() {
        if (instance == null)
            instance = new ArrayListSpesaRepository();
        return instance;
    }


    @Override
    public List<String> getList() {
        return new ArrayList<>(liste.keySet());
    }

    @Override
    public List<String> findListaByNome(String nome) {
        return liste.get(nome).getProdotti();
    }

    @Override
    public boolean removeListaByNome(String nome) {
        if (liste.containsKey(nome)) {
            liste.remove(nome);
            return true;
        } else
            return false;
    }

    @Override
    public boolean addLista(String nome) {
        if (liste.containsKey(nome))
            return false;
        else {
            liste.put(nome, new Lista());
            return true;
        }
    }

    @Override
    public boolean addElemToLista(String nome, String elem) {
        if (liste.containsKey(nome))
            return liste.get(nome).addProdotto(elem);
        return false;
    }

    @Override
    public boolean removeElemToLista(String nome, String elem) {
        if (liste.containsKey(nome))
            return liste.get(nome).removeProdotto(elem);
        return false;
    }
}
