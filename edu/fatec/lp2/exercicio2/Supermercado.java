package edu.fatec.lp2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    private List<ListaCompra> listas;

    public Supermercado() {
        this.listas = new ArrayList<ListaCompra>();
    }

    public void addListaCompra(ListaCompra lista) {
        this.listas.add(lista);
    }

    public List<ListaCompra> getListasCompra() {
        return this.listas;
    }

}
