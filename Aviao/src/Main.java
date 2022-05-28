import classes.Voo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de fileiras: ");
        int fileiras = in.nextInt();
        while(fileiras > 26) {
            System.out.println("");
            System.out.println("Número inválido!");
            System.out.print("Digite a quantidade de fileiras: ");
            fileiras = in.nextInt();
        }
        System.out.print("Digite a quantidade de cadeiras na fileira: ");
        int cadeiras = in.nextInt();
        while(cadeiras > 10) {
            System.out.println("");
            System.out.println("Número inválido!");
            System.out.print("Digite a quantidade de cadeiras na fileira: ");
            cadeiras = in.nextInt();
        }
        Voo v = new Voo(fileiras,cadeiras);


        while(v.quantidadeLivre() > 0) {
            v.mostrarAssentos();
            System.out.print("Digite o código do assento: ");
            String codigoAssento = in.next();
            if (!v.verificaOcupaçao(codigoAssento)) {
                v.ocupar(codigoAssento);
                if (v.quantidadeLivre() == 0) {
                    break;
                }
                System.out.println("Deseja vender outra passagem (S/N): ");
                String res = in.next();
                if (res.equalsIgnoreCase("N")) {
                    break;
                }
            } else {
                System.err.println("Cadeira ocupada!");
            }
        }
        v.mostrarAssentos();
        System.out.println("Boa viagem!");
    }
}
