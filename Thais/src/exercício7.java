import java.util.Scanner;

public class exercício7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica : ");
        double fábrica = in.nextDouble();

        double resultado = fábrica+(fábrica*(28/100.0))+(fábrica * (45/100.0));

        System.out.printf("O custo final ao consumidor: R$%.2f", resultado);
    }
}
//certo