package classes;

public class MiniPizza extends Lanche {
    private boolean bordaRechaeda;
    private String saborBorda;
    private String sabor;
    public MiniPizza() {
        {
        }
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de Tomate");
        this.adicionarIngrediente("Queijo Mussarela");
        this.tipo = "Mini Pizza";
    }

    public void adicionarSaborEIngredientes(String sabor){
        this.setSabor(sabor);
        switch (sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this. adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                break;
            case "FRANGO COM CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case"MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;
        }
    }
    @Override //java usa isso aqui agora
    public void montarComanda() {
        if (this.isBordaRechaeda()){
            System.out.println("====" + this.tipo + " - " + ((MiniPizza) this).sabor + "====");
        }else{
            System.out.println("====" + this.tipo + "====");
        }


        super.montarComanda(); //precisa para referenciar a classe lanche
        if (this.bordaRechaeda) {
            System.out.println("bordaRechaeda" + saborBorda.toUpperCase());
        }
    }
        //getters e setters
        public void setBordaRechaeda(boolean bordaRechaeda) {
            this.bordaRechaeda=bordaRechaeda;
    }
        public boolean isBordaRechaeda() {
            return this.bordaRechaeda;
        }
        public void setSaborBorda(String saborBorda){
            this.saborBorda=saborBorda;
        }
        public String getSaborBorda() {
                return this.saborBorda;
        }
        public void setSabor(String sabor){
            this.sabor = sabor;
        }
        public String getSabor(){
                return this.sabor;
        }
    }