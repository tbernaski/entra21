package classes.lanches;

import java.util.ArrayList;

public abstract class Lanche {
    private ArrayList<String> ingredientes = new ArrayList<>();
    private double valor;
    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public abstract void montarDetalhesComanda();

    public abstract void mostrarDetalhes();









    public String[] getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
}