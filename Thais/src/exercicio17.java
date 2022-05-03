import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a hora de início do jogo :\n ");
        int horainicio = in.nextInt();

        System.out.print("Digite a hora de final do jogo :\n ");
        int horafinal = in.nextInt();

        if (horainicio > horafinal) {
        System.out.println("A duração do jogo foi de aproximadamente: %d", 24 - (horainicio-horafinal));
        } else {
            System.out.printf("A duração do jogo foi de aproximadamente: %d", (horafinal-horainicio));
        }
    }
}


