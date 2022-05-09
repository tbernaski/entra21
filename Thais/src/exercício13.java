import java.util.Scanner;

public class exercício13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de maçãs compradas :\n ");
        int maças = in.nextInt();

        if (maças<12){
            double var1 = (maças*1.30);
            System.out.printf("O valor total da compra é: %.2f" , var1);
        } else {
            double var2 = (maças*1.00);
            System.out.printf("O valor total da compra é: %.2f", var2);
        }
    }
}
//certoo corrigido
