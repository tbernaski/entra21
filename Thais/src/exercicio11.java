import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        double valor = in.nextDouble();

        if (valor > 10) {
            System.out.println("MAIOR QUE 10");
        } else {
            System.out.println("MENOR QUE 10");
        }
    }
}
