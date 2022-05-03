import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas :\n ");
        int trabalhadas = in.nextInt();

        System.out.print("Digite o valor por hora trabalhadas :\n ");
        double porhora = in.nextDouble();

        double salario;
        if (trabalhadas >160) {
            salario = 160*porhora=(trabalhadas-160*(porhora+porhora/2));
        } else {
            salario = trabalhadas*porhora;
            System.out.printf("O salário será de R$", salario);
        }
    }
}