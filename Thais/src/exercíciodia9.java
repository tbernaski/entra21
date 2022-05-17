import java.util.Scanner;

public class exercíciodia9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int fatorial = in.nextInt();
        int valorFinal = 1;
        if (fatorial == 0) {
            valorFinal = 0;
        } else {
            for (int i = fatorial; i > 0; i--) {
                valorFinal *= i;
            }
            System.out.println("Resultado: " + fatorial + " é " + valorFinal);
        }
    }
}