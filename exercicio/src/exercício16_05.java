import java.util.Scanner;

public class exercício16_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = numero.length() -1; i>=0; i--) {
            inverso = inverso + String.valueOf(numero.charAt(i));
        }
        System.out.println((inverso));
    }
}
