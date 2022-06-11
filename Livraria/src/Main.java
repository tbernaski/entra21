import Livraria.*;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    private static Livro escolha;
    private static int Livro;

    public static void main(String[] args) {
        Estante e = new Estante(5);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - Adicionar item");
        System.out.println("(2) - Buscar e tratar retorno");
        System.out.println("(3) - Remover ");
        System.out.println("(4) - Mostrar itens da estante");
        System.out.println("(0) - Sair");
        int escolha = in.nextInt();
        in.nextLine();
        Item item = null;

        switch (escolha) {
            case 1:
                item = new adicionarItem(e);
                break;
            case 2:
                item = new buscarItem();
                break;
            case 3:
                item = new removerItem();
                break;
            case 4:
                item = new mostrarItem();
                break;
            case 0:
                item = new sair();
                break;
        }


        public static void adicionarItem (Estante e){
            if (e.estanteCheia()) {
                System.out.println("Sua estante está cheia! Não é possível adicionar mais itens!");
            }else{
                Item i = null;
                int escolha = -1;
                while (escolha) < 0 || escolha > 1){
                    System.out.println("Informe o item que deseja adicionar:  (0) - Livro   /    (1) - DVD");
                    escolha = in.nextInt();
                    if (escolha <0) || escolha > 1 {
                        System.err.println("Selecione uma opção válida");
                    }
                }
                in.nextLine();
                if (escolha == 0) {
                    i = new Livro();
                }else{
                    i = new DVD();
                }
                System.out.println("Digite o título: ");
                i.setTitulo(in.nextLine());
                System.out.println("Digite o gênero: ");
                i.setGenero(in.nextLine());
                System.out.println("Digite o valor R$: ");
                i.setValor(in.nextDouble());

               */* if (i instanceof Livro){
                    Livro l =((Livro) i);
                System.out.println("Digite o nome do autor do livro: ");
                l.setAutor(in.nextLine());
                System.out.println("Digite a quantidade de páginas do livro: ");
                l.setQtidePaginas(in.nextInt());
                System.out.println("Digite o ano de publicação do livro: ");
                l.setAnoPublicacao(in.nextInt());
                System.out.println("Digite o edição do livro: ");
                l.setEdicao(in.nextInt());
            } else {
                    DVD dvd = ((DVD) i);
                    System.out.println("Digite o diretor: ");
                    dvd.setDiretor(in.nextLine());
                    System.out.println("Digite o ano de lançamento: ");
                    dvd.setAnoLancamento(in.nextInt());
                    System.out.println("Digite a duração: ");
                    dvd.setDuracao(in.nextDouble());
                }
              */
                if (!e.adicionarItem(i)) {
                    System.err.println("Não foi possível adicionar o item na estante");
                }else{
                    System.out.println("Item adicionado com sucesso!");
                }
            }
    }}

    public static void buscarItem(){

    }

    public static void removerItem(){

    }

    public static void mostrarItem(){

    }

    public static void sair() {

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