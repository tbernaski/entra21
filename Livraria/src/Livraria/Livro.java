package Livraria;

import java.util.Scanner;

public class Livro extends Item {
    private String autor;
    private int qtidePaginas;
    private int anoPublicacao;
    private int edicao;


    //getters e setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtidePaginas() {
        return qtidePaginas;
    }

    public void setQtidePaginas(int qtidePaginas) {
        this.qtidePaginas = qtidePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }


    @Override
    public void montarDetalhes(Scanner in) {
        System.out.print("Informe o autor: ");
        this.setAutor(in.nextLine());
        System.out.print("Informe a quantidade de páginas: ");
        this.setQtdePaginas(in.nextInt());
        System.out.print("Informe o ano de publicação: ");
        this.setAnoPublicacao(in.nextInt());
        System.out.println("Informe a edição: ");
        this.setEdicao(in.nextInt());
        in.nextLine();
    }

    private void setQtdePaginas(int nextInt) {
    }

    @Override
    public void mostrarDetalhes() {
        System.out.print("Autor: "+autor);
        System.out.print("Quantidade de paginas: "+qtidePaginas);
        System.out.print("Ano de publicação: "+anoPublicacao);
        System.out.println("Edição: "+edicao);
    }
}