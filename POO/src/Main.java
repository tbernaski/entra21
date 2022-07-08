import classes.cliente.Cliente;
import classes.lanches.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if(in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: "+cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        Lanche lanche = null;
        while (lanche == null) {
            System.out.println("-MENU: Escolha uma opção-");
            System.out.println("(1) - X-Salada");
            System.out.println("(2) - X-Burguer");
            System.out.println("(3) - Misto Quente");
            System.out.println("(4) - Hot Dog");
            System.out.println("(5) - Mini Pizza");
            System.out.println("(6) - Pizza");
            int escolha = 0;
            try {
                escolha = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha um lanche válido!");
            } finally {
                in.nextLine();
            }
            ETipoLanche escolha = (ETipoLanche) escolherOpcao(null);
            switch (escolha) {
                case 1 -> X_SALADA= new XSalada();
                case 2 -> X_BURGUER= new XBurguer();
                case 3 -> MISTO_QUENTE = new MistoQuente();
                case 4 -> HOT_DOG = new HotDog();
                case 5 -> MINI_PIZZA = new MiniPizza();
                case 6 -> PIZZA = new Pizza();
                default -> System.err.println("Escolha uma opção válida!");
            }
        }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) "+lanche.getTipo()+": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }

    private static Object escolherOpcao(Object o) {
    }
}