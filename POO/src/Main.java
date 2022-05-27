import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza - Calabresa");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;
            case 2:
                lanche = new XBurguer();
                break;
            case 3:
                lanche = new MistoQuente();
                break;
            case 4:
                lanche = new HotDog();
                break;
            case 5:
                lanche = new MiniPizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (lanche instanceof Sanduiche) {
            //adicionais
            System.out.println("Deseja algum adicional? (S/N)");
            String adicionais = in.next();
            if (adicionais.equalsIgnoreCase("S")){
                //adicionar os adicionais
                for (int i =0; i < 10 ; i++) {
                    //pedir adicionais
                    System.out.println("Digite os adicionais: ");
                    ((Sanduiche) lanche).adicionarAdicional(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if (parada.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
            if (lanche instanceof XBurguer) {
                System.out.println("Lanche aberto? (S/N)");
                String aberto = in.next();
                ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
            }
        } else {
            System.out.println("Borda Recheada? (S/N)");
            String aberto = in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRechaeda = aberto.equalsIgnoreCase("S");
            if (miniPizza.bordaRechaeda) {
                System.out.println("Digite o sabor da borda: ");
                miniPizza.saborBorda = in.nextLine();
            }
        }
        System.out.print("Informe o valor do lanche: R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}
