import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite seu nome completo");
        String nome = in.nextLine();
        String[] nomes = nome.split(" ");
        System.out.println(nomes[0].charAt(0)+ ". "+nomes[1].charAt(0)+ ".");
    }
}
