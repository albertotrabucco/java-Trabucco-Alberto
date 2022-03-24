package com.engim.lezione12.Model;

import java.util.List;

public interface SpesaRepository {
    List<String> getList();
    List<String> findListaByNome(String nome);
    boolean removeListaByNome(String nome);
    boolean addLista(String nome);
    boolean addElemToLista(String elem);
    boolean removeElemToLista(String elem);
}
