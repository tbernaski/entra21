package classes.pedido;

import classes.lanches.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Pedido {

    private HashMap<Lanche, Double> lanches = new HashMap<>;

    public void imprimirComanda() {
        for (Lanche l : this.getLanches()) {
            l.mostrarDetalhesComanda();
            System.out.println("-INGREDIENTES-");
            for (String ingrediente : l.getIngredientes()) {
                System.out.println(ingrediente);
            }
            System.out.printf("Valor: R$%.2f\n", l.getValor());
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("------------------------------------");
    }

    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            vlrTotal += l.getValor();
        }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.put(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}