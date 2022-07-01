public class Main {
    public enum MesesDoAno{
        JANEIRO (1, "Janeiro"),
        FEVEREIRO (2, "Fevereiro"),
        MARCO (3, "Março");

        private int valor;
        private String descricao;

        MesesDoAno (int valor, String descricao){
            this.valor = valor;
            this.descricao = descricao;
        }


        public int getValor() {
            return valor;
        }


        public String getDescricao() {
            return descricao;
        }

        public static void main(String[] args) {
            MesesDoAno mes = MesesDoAno.FEVEREIRO;
            System.out.println("Valor da constante: " +mes+"\n"              );
        }


    }
}
