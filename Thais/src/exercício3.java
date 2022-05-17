import java.util.Scanner;

public class exercício3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = in.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = in.nextDouble();

        double area = base * altura;
        double perimetro = base + base + altura + altura;

        System.out.printf("Área: %.2f", area);
        System.out.printf("Perímetro: %.2f", perimetro);
    }
}
