import java.util.Scanner;

public class exercício12 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Digite um valor :\n ");
            double valor = in.nextDouble();

        if (valor < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }
}
