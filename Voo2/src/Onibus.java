import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    private boolean leito;

    public Onibus(int linhasCadeiras) {
        for (int i = 1; i <= linhasCadeiras * 4; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }


    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }


    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }


    @Override
    public int quantidadeLivre() {
        int assentosLivre = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado())
                assentosLivre++;
        }
        return assentosLivre;
    }



    @Override
    public void mostrarAssentos() {
        int cont = 0;
        for (AssentoOnibus a : assentos) {
            cont++;
            if ((cont % 4) == 0) {
                if (a.isOcupado()) {
                    System.out.printf("[XX]\n");
                } else {
                    System.out.printf("["+a.getLugar()+"]\n");
                }
            } else {
                if (a.isOcupado()) {
                    System.out.printf("[XX] ");
                } else {
                    System.out.print("[" + a.getLugar() + "] ");
                }
            }
            if ((cont % 2) == 0 && (cont % 4) != 0) {
                System.out.print("|| ");
            }
        }
    }



    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento))
                return a;
        }
        return null;
    }
}