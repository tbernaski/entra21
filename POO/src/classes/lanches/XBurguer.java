package classes;
public class XBurguer extends Sanduiche {

    private boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");
    }

    @Override //java usa isso aqui agora
    public void montarComanda() {
        super.montarComanda(); //precisa para referenciar a classe lanche
        if (this.aberto) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isAberto() {
        return this.aberto;
    }
}