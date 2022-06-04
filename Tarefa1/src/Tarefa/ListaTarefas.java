package Tarefa;

public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;

    private Tarefa [] tarefas;

    public boolean adicionarTarefa(Tarefa tarefa){
    }


    public Tarefa buscarTarefa (int posicao){
    }


    public boolean alterarOrdemTarefa (Tarefa tarefa, int novaPosicao){
    }


    public ListaTarefas (int tamanhoLista){
    }


    //getters e setters

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Tarefa.Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa.Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}