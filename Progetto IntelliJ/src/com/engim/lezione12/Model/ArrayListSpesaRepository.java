package com.engim.lezione12.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArrayListSpesaRepository implements SpesaRepository{

    private static SpesaRepository instance;
    private Map<String, Lista> liste;

    private ArrayListSpesaRepository(){
        instance = this;
    }

    public static SpesaRepository getInstance(){
        if(instance == null)
            instance = new ArrayListSpesaRepository();
        return instance;
    }



    @Override
    public List<String> getList() {
        return new ArrayList<>(liste.keySet());
    }

    @Override
    public List<String> findListaByNome(String nome) {
        return null;
    }

    @Override
    public boolean removeListaByNome(String nome) {
        return false;
    }

    @Override
    public boolean addLista(String nome) {
        return false;
    }

    @Override
    public boolean addElemToLista(String elem) {
        return false;
    }

    @Override
    public boolean removeElemToLista(String elem) {
        return false;
    }
}
