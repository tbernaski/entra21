import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class exercício3_dia16_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int randomico = r.nextInt(101);
        int chutes = 0;
        while (true){
            System.out.println("Digite um número: ");
            int valorInformado = in.nextInt();
            chutes++;
            if (valorInformado == randomico) {
                System.out.println("Acertou MIZERAVI");
                break;
            }else if (valorInformado> randomico) {
                System.out.println("Muito alto, tente novamente: ");
            }else {
                System.out.println ("Muito baixo, tente novamente: ");
            }
        }
        System.out.println("Quantidade de tentativas: "+chutes);
    }
}
