import java.util.Scanner;

public class exercício1_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Lenght: "+algo.length()); //conta os caracteres até os espaços
        System.out.println("Lenght: "+algo.isEmpty());
        System.out.println("Uppercase: "+algo.toUpperCase()); //letra maiúscula
        System.out.println("Lowercase: "+algo.toLowerCase()); // letra minúscula
    }
}

