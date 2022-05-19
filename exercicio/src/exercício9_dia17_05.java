import java.util.Scanner;

public class exercício9_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de palavras: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("informe um número > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }
}