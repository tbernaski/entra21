package Livraria;

import java.util.Scanner;       //isNaN

public class DVD extends Item {
    private String diretor;
    private double duracao;
    private int anoLancamento;



//getters e setters

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void montarDetalhes(Scanner in) {
        System.out.println("Informe o diretor: ");
        this.setDiretor(in.nextLine());
        System.out.println("Informe o ano de lançamento: ");
        this.setAnoLancamento(in.nextInt());
        System.out.println("Informe a duração: ");
        this.setDuracao(in.nextDouble());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {
        System.out.print("Diretor: "+diretor);
        System.out.print("Ano de lançamento: "+anoLancamento);
        System.out.print("Duração: "+duracao);
    }
}