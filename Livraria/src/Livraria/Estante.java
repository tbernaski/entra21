package Livraria;

import java.util.ArrayList;

public class Estante {
    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();


    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
    }


    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }


    public int quantidadeItens() {
        return this.itens.size();
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItens()) {
            if (i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;

        //return this.itens.stream().filter(i -> i.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
    }


    public boolean adicionarItem(Item item) {
            if (!estanteCheia()){
                this.itens.add(item);
                return true;
            }
        return false;
    }


    public Item removerItem(int posicao) {
        return this.itens.remove (posicao);
    }


    //Getters e setters
    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}