import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor :\n ");
        double valor1 = in.nextDouble();

        System.out.print("Digite um valor :\n ");
        double valor2 = in.nextDouble();

        if (valor1 < valor2) {
            System.out.printf("A ordem crescente é:" +valor1);
        } else {
            System.out.printf("A ordem crescente é: "+ valor2);
        }
    }
}
//certo corrigido