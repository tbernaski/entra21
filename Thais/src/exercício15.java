import java.util.Scanner;

public class exercício15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor :\n ");
        double valor1 = in.nextDouble();

        System.out.print("Digite um valor :\n ");
        double valor2 = in.nextDouble();

        if (valor1>valor2){
            System.out.println("O primeiro valor é maior que o segundo");
        } else {
            System.out.println("O segundo valor é maior que o primeiro");
        }
    }
}
// certo corrigido