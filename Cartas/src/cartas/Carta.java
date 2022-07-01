package cartas;

public class Carta {
    private Naipe naipe;
    private ValorCarta valor;
    private int ValorReal;



//Getters e Setters
    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }

    public int getValorReal() {
        return ValorReal;
    }

    public void setValorReal(int valorReal) {
        ValorReal = valorReal;
    }
}