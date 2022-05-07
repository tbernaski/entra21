import java.util.Scanner;

public class exercicioseis3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int  i= 0; i < 5; i++) {
            System.out.print("Digite um número:  ");
            soma += in.nextInt();
        }
        System.out.println("A soma é: " +soma);
    }
}
