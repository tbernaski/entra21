import java.util.Scanner;

public class exercício8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o salário fixo do mês : ");
        double salário = in.nextDouble();

        System.out.print("Digite a comissão : ");
        double comissão = in.nextDouble();

        System.out.print("Digite o valor das vendas : ");
        double vendas = in.nextDouble();

        double resultado = salário + comissão + (vendas*5/100.0);

        System.out.println("O salário final do vendedor é "+ resultado);
    }
}
// certo