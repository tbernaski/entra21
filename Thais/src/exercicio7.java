import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica : ");
        double fábrica = in.nextDouble();

        System.out.print("Digite a porcentagem do distribuidor: ");
        double distribuidor = in.nextDouble();

        System.out.print("Digite os impostos: ");
        double impostos = in.nextDouble();

        double resultado = fábrica+(fábrica*(28/100.0))+(fábrica * (45/100.0));

        System.out.println("O custo final ao consumidor: "+ resultado);
    }
}
