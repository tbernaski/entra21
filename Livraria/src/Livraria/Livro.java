package Livraria;

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


}