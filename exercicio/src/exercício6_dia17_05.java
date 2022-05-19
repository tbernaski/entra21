import java.util.Scanner;

public class exercício6_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algumacoisa = in.nextLine();
int pos = algo.indexOf(algumacoisa);
        System.out.println("A posição de " + algumacoisa + " em " +algo+ " é " +pos);
    }
}

