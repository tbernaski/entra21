package classes;

public class Pizza extends MiniPizza{
    private String tamanho;

    public Pizza (){
        this.tipo = "Pizza";
    }
    @Override
    public void montarComanda(){
        super.montarComanda();
        System.out.println("Tamanho: "+this.getTamanho());
    }
    public void setTamanho(String tamanho){ //seta o valor da variável
        this.tamanho= tamanho;
    }

    public String getTamanho(){ //retorna o valor da variável
        return this.tamanho;
    }
}