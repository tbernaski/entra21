package classes.cliente;

import classes.pedido.Pedido;

public class Cliente {
    private String nome;                    //agregação- tem um
    private Pedido pedido;                 //composição - é parte
                                          //herança- é um
    public Cliente(){
        this.setPedido(new Pedido());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
