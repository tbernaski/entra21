import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Qual tabuada deseja saber?");
        int valor = batata.nextInt();

        while (valor != 0) {

            for (int var1 = 0; var1 <= 10; var1++) {
                System.out.println(var1 * valor);
            }

            System.out.println("Qual tabuada deseja saber?");
            valor = batata.nextInt();
        }
    }
}