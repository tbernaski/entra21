package classes;

public class MiniPizza extends Lanche {
    public boolean bordaRechaeda;
    public String saborBorda;
    public MiniPizza() {
        {
        }
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de Tomate");
        this.adicionarIngrediente("Queijo Mussarela");
        this.adicionarIngrediente("Calabresa");
        this.tipo = "Mini Pizza";
    }

    @Override //java usa isso aqui agora
    public void montarComanda() {
        super.montarComanda(); //precisa para referenciar a classe lanche
        if (this.bordaRechaeda) {
            System.out.println("bordaRechaeda"+saborBorda.toUpperCase());
        }
    }
}