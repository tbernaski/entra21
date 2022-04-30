import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de maçãs compradas :\n ");
        double maças = in.nextDouble();

        if (maças<12){
            double var1 = (maças*1.30);

        } else {
            double var2 = (maças*1.00);

            System.out.println("O valor total da compra é: "+ var2);
        }
    }
}

