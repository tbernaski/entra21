import java.util.Scanner;

public class exercício2_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algo = in.nextLine();
        System.out.println("Digite algo (de novo): ");
        String algumacoisa = in.nextLine();
        if (algo.equals(algumacoisa)) {
            System.out.println("São iguais");
        } else if (algo.equalsIgnoreCase(algumacoisa)) {
            System.out.println("São iguais independente de case");
        } else {
            System.out.println("São diferentes");
        }
    }
}