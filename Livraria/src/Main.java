import Livraria.DVD;
import Livraria.Estante;
import Livraria.Item;
import Livraria.Livro;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    private static Livro escolha;
    private static int Livro;

    public static void main(String[] args) {

        System.out.println("-MENU: Escolha um item para adicionar-");
        System.out.println("(1) - Livro");
        System.out.println("(2) - DVD");
        int escolha = in.nextInt();
        in.nextLine();
        Item item = null;

        switch (escolha) {
            case 1:
                item = new Livro();
                break;
            case 2:
                item = new DVD();
                break;
        }

        if (escolha == 1) {
            System.out.println("Digite o nome do autor do livro: ");
            in.nextLine();
            System.out.println("Digite a quantidade de páginas do livro: ");
            in.nextLine();
            System.out.println("Digite o ano de publicação do livro: ");
            in.nextLine();
            System.out.println("Digite o edição do livro: ");
            in.nextLine();
                System.out.println("Deseja inserir mais um item? (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")) {
                

            } else {
                System.out.println("Digite o nome do diretor do DVD: ");
                in.nextLine();
                System.out.println("Digite o tempo de duração do DVD: ");
                in.nextLine();
                System.out.println("Digite o ano de lançamento do DVD: ");
                in.nextLine();
                System.out.println("Deseja inserir mais um item? (S/N)");
                if (in.nextLine().equalsIgnoreCase("N")) {

                }
            }
        }




            Estante l = new Estante(5);
            l.getItens();
            for (int i = 0; i < 5; i++) {
                l.getItens();
                if (i == 4) {
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            getLivro();
            for (int j = 0; i < 5; i++) {
            }
        }
    }


    public static Scanner getIn() {
        return in;
    }

    public static void setIn(Scanner in) {
        Main.in = in;
    }

    public static Livraria.Livro getEscolha() {
        return escolha;
    }

    public static void setEscolha(Livraria.Livro escolha) {
        Main.escolha = escolha;
    }

    public static int getLivro() {
        return Livro;
    }

    public static void setLivro(int livro) {
        Livro = livro;
    }
}


