package Livraria;

public enum EMenuItem implements IMenu{

    AVALIACOES(1, "Ver Avaliações"),
    AVALIAR_ITEM(2, "Avaliar"),
    VOLTAR(0, "Sair"),

    MOSTRAR_DETALHES (3, "Mostrar Detalhes");

    private int valorOpcao;
    private String descricao;

    EMenuItem(int valorOpcao, String descricao) {
        this.valorOpcao = valorOpcao;
        this.descricao = descricao;
    }

    public static EMenuItem getByValorOpcao(int escolha) {
        for (EMenuItem e : EMenuItem.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }


    //Getters
    public int getValorOpcao() {
        return valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }
}
