import java.util.Scanner;

public class exercício5_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algumacoisa = in.nextLine();
        if (algo.endsWith(algumacoisa)) {
            System.out.println(algumacoisa + " é sufixo de " + algo);
        } else if (algumacoisa.endsWith(algo)) {
            System.out.println(algo + " é sufixo de " + algumacoisa);
        } else {
            System.out.println("As strings não são sufixos uma da outra");
        }
    }
}
