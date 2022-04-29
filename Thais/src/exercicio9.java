import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus fahrenheit : ");
        double temperatura = in.nextDouble();

        double resultado = (temperatura - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + resultado);
    }
}

//certo