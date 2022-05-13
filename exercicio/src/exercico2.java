import java.util.Scanner;

public class exercico2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = in.nextLine();

        String reverse = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverse += palavra.charAt(i);
        }
        if (reverse.equals(palavra)) {
            System.out.println("A palavra é um palíndromo: " + palavra);
        } else {
            System.out.println("A palavra não é um palídromo: " + palavra);
        }
    }
}
