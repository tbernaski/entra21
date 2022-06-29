import java.util.ArrayList;

public class Aviao implements MeioTransporte {

    private ArrayList<AssentoVoo> assentos = new ArrayList<>();


    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        String letrasLuxo[] = {"A", "B", "C", "D"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < linhasCadeirasLuxo; j++) {
                AssentoVoo assento = new AssentoVoo();
                assento.setClasse(ClasseAssentoVoo.LUXO);
                assento.setCodigo(letrasLuxo[i] + j);
                assentos.add(assento);
            }
        }

        String letrasEconomica[] = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < linhasCadeirasEconomicas; j++) {
                AssentoVoo assento = new AssentoVoo();
                assento.setClasse(ClasseAssentoVoo.ECONOMICA);
                assento.setCodigo(letrasEconomica[i] + j);
                assentos.add(assento);
            }
        }
    }


    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }


    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int Livres = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                Livres++;
            }
        }
        return Livres;
    }

    @Override
    public void mostrarAssentos() {
        int contadorLuxo = 0;
        int contadorEconomica = 0;
        for (AssentoVoo a : assentos) {
            if (a.getClasse().equals(ClasseAssentoVoo.LUXO)) {
                contadorLuxo++;
                if (a.getCodigo().contains("A")){
                    System.out.print("     ");
                }
                if ((contadorLuxo % 4 == 0)) {
                    System.out.print("[" + a.getCodigo() + "]\n");
                } else {
                    System.out.print("[" + a.getCodigo() + "] ");
                }
            }

            if (a.getClasse().equals(ClasseAssentoVoo.ECONOMICA)) {
                contadorEconomica++;
                if ((contadorEconomica % 6 == 0)) {
                    System.out.print("[" + a.getCodigo() + "]\n");
                } else {
                    System.out.print("[" + a.getCodigo() + "] ");
                }
            }
        }
    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }


    public Assento getAssento (String assento, ClasseAssentoVoo classe){
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equals(classe)){
                return a;
            }
        }
        return null;
    }
}