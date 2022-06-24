package classes.lanches;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Lanche {
    private ArrayList<String> ingredientes = new ArrayList<>();
    private double valor;
    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public abstract void mostrarDetalhesComanda();

    public abstract void montarDetalhesLanche(Scanner in);

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public double getValor() {
        double valorTotal = super.getValor();
        for (Double v : this.adicionais.values()) {
            valorTotal += v;
        }
        return valorTotal;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}