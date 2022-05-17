import java.util.Scanner;

public class exercício34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de palavras que deseja");
        int numero = in.nextInt();

        String[] palavras = new String[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("Informe a palavra");
            palavras[i] = in.next();
        }
        String palavrafinal = "";
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                palavrafinal+=palavras[i];
            } else {
                palavrafinal+= ", " +palavras[i];
            }
        }
        System.out.println(palavrafinal);
    }
}

