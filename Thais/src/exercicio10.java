import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a nota1 : ");
        double nota1 = in.nextDouble();

        System.out.print("Digite a nota2 : ");
        double nota2 = in.nextDouble();

        System.out.print("Digite a nota3 : ");
        double nota3 = in.nextDouble();

        double media = nota1-2 + nota2*3 + nota3*5 /10;

        System.out.println("A média final é: " + media);

    }

}
// nsei