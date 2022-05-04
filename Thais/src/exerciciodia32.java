import java.util.Scanner;

public class exerciciodia32 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber?");
        int valor = batata.nextInt();
        for (int potat = 0; potat <= 10; potat++) {
            System.out.println(potat*valor);
        }
    }
}
