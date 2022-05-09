import java.util.Scanner;

public class exercício11 {

    public static void main(String[] args) {
    //entrada
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        double valor = in.nextDouble();

        //processamento
        if (valor > 10) {
            System.out.println("MAIOR QUE 10");
        } else {
            //saída
            System.out.println("MENOR QUE 10");
        }
    }
}

//certo corrigido