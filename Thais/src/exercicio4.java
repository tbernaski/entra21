import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();

        System.out.print("Digite seus meses: ");
        int meses = in.nextInt();

        System.out.print("Digite seus dias: ");
        int dias = in.nextInt();

        int idadeemdias = idade * 365 + meses * 30 + dias;

        System.out.println("Você tem esses dias vividos: "+ idadeemdias);
    }
}
