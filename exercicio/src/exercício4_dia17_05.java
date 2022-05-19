import java.util.Scanner;

public class exercício4_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algumacoisa = in.nextLine();
        if (algo.startsWith(algumacoisa)) {
            System.out.println(algumacoisa + " é prefixo de " + algo);
        } else if (algumacoisa.startsWith(algo)) {
            System.out.println(algo + " é prefixo de " + algumacoisa);
        } else {
            System.out.println("As strings não são prefixos uma da outra");
        }
    }
}
