import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> Carros = new HashMap<>();
        boolean executa = true;
        while (true) {
            System.out.println("MENU");
            System.out.println("1 - Lista de carros disponíveis");
            System.out.println("2 - Adicionar um carro para a lista de vendas");
            System.out.println("3 - Vender/Remover um carro");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    boolean carros = false;
                    System.out.println(carros);
                    break;
                case 2:
                    System.out.println("Informe um carro para adicionar: ");
                    String chave = in.nextLine().toLowerCase();
                    break;
                case 3:
                    if (escolha ==4){
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        System.out.println("Informe um novo carro");
                        in.nextLine();
                        break;


                    }


            }
        }
    }
}

