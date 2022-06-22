package classes.pedido;

import classes.lanches.*;

import java.util.ArrayList;

public class Pedido {
    private Lanche[] lanches = new Lanche[10];


    public void imprimirComanda() {
        for (Lanche l : this.getLanches()) {
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l);
                    System.out.println("====" + l.getTipo() + " - " + mp.getSabor() + "====");
                    if (mp.isBordaRechaeda()) {
                        System.out.println("-- COM BORDA RECHEADA: " + mp.getSaborBorda() + " - " + ((MiniPizza) mp).getSabor() + "====");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("====" + l.getTipo() + "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("-- LANCHE ABERTO --");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", l.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getAdicionais()[0] != null) {
                        System.out.println("-ADICIONAIS-");
                        for (String adicional : s.getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional);
                            }
                        }
                    }
                }
            }
            System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
            System.out.println("-------------------------------");
        }
    -

    public double calcularValorTotal() {
        double vlorTotal = 0;
        for (Lanche l : this.getLanches()) {
                vlorTotal += l.getValor();
            }
        }
        return vlorTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);

        public ArrayList<Lanche> getLanches() {
            return this.lanches;
        }
    }
}
