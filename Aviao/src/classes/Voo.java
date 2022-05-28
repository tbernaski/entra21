package classes;

public class Voo {
    public String[][] codificacaoAssento;
    public boolean[][] ocupacaoAssento;

    public Voo (int linhas, int cadeirasPorLinha){
        this.codificacaoAssento = new String [linhas][cadeirasPorLinha];
        this.ocupacaoAssento = new boolean [linhas][cadeirasPorLinha];
        String[] alfabeto = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < cadeirasPorLinha; j++) {
                if (this.codificacaoAssento[i][j] == null) {
                    this.codificacaoAssento [i][j]= alfabeto[i]+String.valueOf(j+1);
                }
            }
        }
    }


    public boolean verificaOcupaçao(String assento){
      boolean ocupado = false;
        for (int i =0; i < this.codificacaoAssento.length;i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                if (assento.equalsIgnoreCase(this.codificacaoAssento[i][j])) {
                    return this.ocupacaoAssento[i][j];
                }
            }
        }
        return false;
    }

    public void ocupar (String assento) {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[0].length; j++) {
               if (assento.equals(this.codificacaoAssento[i][j])){
                   this.ocupacaoAssento[i][j] = true;
               }
            }
        }
    }

    public int quantidadeLivre() {
        int cont = 0;
        for (int i = 0; i < codificacaoAssento.length; i++) {
            for (int j = 0; j < codificacaoAssento[0].length; j++) {
                if (!this.ocupacaoAssento[i][j]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public void mostrarAssentos() {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                if(!this.ocupacaoAssento[i][j]) {
                    System.out.print(this.codificacaoAssento[i][j]+" ");
                } else {
                    System.out.print("--");
                }
            }
            System.out.println("");
        }
    }
}
