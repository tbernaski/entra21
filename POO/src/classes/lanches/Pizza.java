package classes.lanches;

public class Pizza extends MiniPizza{
    private String tamanho;

    public Pizza (){
        this.setTipo("Pizza");
    }

    public void setTamanho(String tamanho){ //seta o valor da variável
        this.tamanho= tamanho;
    }

    public String getTamanho(){ //retorna o valor da variável
        return this.tamanho;
    }
}