import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o ano atual :\n ");
        int atual = in.nextInt();

        System.out.println("Digite o ano de nascimento: \n");
        int nascimento = in.nextInt();

        if (atual-nascimento >=16){
            System.out.println("Você poderá votar esse ano");
        } else {
            System.out.println("Você não poderá votar esse ano");
        }
    }
}
//certo corrigido