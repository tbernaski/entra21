import java.util.Scanner;

public class exercício10_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros da primeira lista: ");
        int nums = in.nextInt();
        int[] numeros1 = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe um número: ");
            numeros1[i] = in.nextInt();
        }
        System.out.println("Informe a quantidade de numeros da segunda lista: ");
        int nums2 = in.nextInt();
        int[] numeros2 = new int[nums2];
        for (int i = 0; i < nums2; i++) {
            System.out.println("Informe um número: ");
            numeros2[i] = in.nextInt();
        }

        for (int valor1 : numeros1) {
            boolean achou = false;
            for (int valor2 : numeros2) {
                if (valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println(valor1);
            }
        }
    }
}