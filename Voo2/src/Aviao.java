import java.util.ArrayList;

public class Aviao implements MeioTransporte {

    private ArrayList<AssentoVoo> assentos = new ArrayList<>();








    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (int i = 0; i <verificaOcupacao(); i++){
        }
        return false;
}



    @Override
    public int quantidadeLivre() {
        int contador = 0;
        for (int i = 0; i <quantidadeLivre(); i++) {
            contador ++;
        }
        return contador;
    }


    @Override
    public void mostrarAssentos() {
     //nao precisa
    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }
}