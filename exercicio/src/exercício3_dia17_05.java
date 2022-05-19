import java.util.Scanner;

public class exercício3_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algo = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algumacoisa = in.nextLine();
        if (algo.contains(algumacoisa)) {
            System.out.println(algumacoisa + " faz parte de " + algo);
        }else if (algumacoisa.contains(algo)) {
            System.out.println(algo + " faz parte de " + algumacoisa);
        }else{
            System.out.println("Nenhuma string faz parte da outra");
        }
    }
}