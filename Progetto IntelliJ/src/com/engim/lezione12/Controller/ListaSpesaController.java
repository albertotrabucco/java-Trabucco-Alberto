package com.engim.lezione12.Controller;

import com.engim.lezione12.Model.ArrayListSpesaRepository;
import com.engim.lezione12.Model.SpesaRepository;

import java.util.List;

public class ListaSpesaController {

    private SpesaRepository spesaRepository;

    public ListaSpesaController() {
        spesaRepository = ArrayListSpesaRepository.getInstance();
    }

    public List<String> getNomiListe() {
        return spesaRepository.getList();
    }

    public boolean setNomeLista(String risposta) {
        return spesaRepository.addLista(risposta);
    }


    public boolean removeLista(String risposta) {
        return spesaRepository.removeListaByNome(risposta);
    }

    public List<String> readLista(String risposta) {
        return spesaRepository.findListaByNome(risposta);
    }

    public boolean addElemToLista(String lista, String elem) {
        return spesaRepository.addElemToLista(lista,elem);
    }

    public boolean removeElemToLista(String lista, String elem) {
        return spesaRepository.removeElemToLista(lista,elem);
    }
}
