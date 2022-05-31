import classes.*;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");
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
            case 6:
                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (lanche instanceof Sanduiche) {
            //adicionais
            System.out.println("Deseja algum adicional? (S/N)");
            String adicionais = in.nextLine();
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
            System.out.println("Qual o sabor você deseja da pizza? ");
            System.out.println("(1) - 4 queijos");
            System.out.println("(2) - Calabresa");
            System.out.println("(3) - Frango c/ catupiry");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor){
                case 1:
                    miniPizza.adicionarSaborEIngredientes("4 queijos");
                    break;
                case 2:
                    miniPizza.adicionarSaborEIngredientes("Calabresa");
                    break;
                case 3:
                    miniPizza.adicionarSaborEIngredientes("Frango c/ catupiry");
                    break;
                case 4:
                    miniPizza.adicionarSaborEIngredientes("Marguerita");
                    break;
                case 5:
                    miniPizza.adicionarSaborEIngredientes("Portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor válido");
            }

            if (lanche instanceof Pizza){
                System.out.println("informe o tamanho da pizza: ");
                System.out.println("XS - broto");
                System.out.println("SM - pequena");
                System.out.println("MD - média");
                System.out.println("LG - grande");
                System.out.println("Xl - família");
                ((Pizza)lanche).setTamanho(in.nextLine().toUpperCase());
            }


            System.out.println("Borda Recheada? (S/N)");
            String aberto = in.nextLine();
            MiniPizza MiniPizza = ((MiniPizza) lanche);
            miniPizza.setBordaRechaeda(aberto.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRechaeda()) {
                System.out.println("Digite o sabor da borda: ");
                miniPizza.setSaborBorda(in.nextLine());
            }
        }
        System.out.print("Informe o valor do lanche: R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}
