import java.util.Scanner;

public class exercício6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o salário mensal: ");
        double salário = in.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double reajuste = in.nextDouble();

        double novosalario = (salário*reajuste) /100;

        System.out.println("Seu novo salário é: "+ novosalario);
    }
}
//verificar