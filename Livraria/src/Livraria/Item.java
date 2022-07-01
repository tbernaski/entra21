package Livraria;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {       //classe abstrata


    private String titulo;
    private String genero;
    private double valor;


    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();


    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao a = new Avaliacao();
        System.out.print("Informe o nome do Avaliador: ");
        a.setNome(in.nextLine());
        System.out.print("Digite uma nota de 0 a 10: ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Informe algum feedback (opcional): ");
        a.setFeedback(in.nextLine());
       this.avaliacoes.add(a);
    }


    public double getTotalRating() {
        return this.avaliacoes.stream().mapToDouble(av -> getTotalRating()).sum() / this.avaliacoes.size();
    }


    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}