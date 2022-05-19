import java.util.Scanner;

public class exercício8_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de números: ");
        int números = in.nextInt();
        int[] nums = new int[números];
        for (int i = 0; i < números; i++) {
            System.out.println("Informe um número: ");
            nums[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : nums) {
            if (valor % 2 == 0){
                somaPar += valor;
            }else{
                somaImpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores impares: " + somaImpar);
    }
}