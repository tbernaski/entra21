import java.security.CodeSource;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - Mostrar lista de produtos");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.println("Informe o produto: ");
                    String chave = in.nextLine().toLowerCase();
                    if (produtos.containsKey(chave)) {
                        System.out.println("Produto já existente, deseja atualizar o valor? (S/N)");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.println("Informe o valor: ");
                    double valor = in.nextDouble();
                    produtos.put(chave, valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    }else{
                        System.out.println("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                        }else{
                            System.out.println("Produto  '" +busca+"' não encontrado!");
                        }
                    }
                    break;
                case 3:
                    System.out.println(produtos); break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        System.out.println("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                        }else{
                            System.out.println("Produto  '" +busca+"' não encontrado!");
                        }
                    }
                    break;
                default:
                    System.out.println("Informe uma opção válida!"); break;
            }
            System.out.println(produtos);





       /* produtos.put("maçã", 1.60);
        produtos.put("banana", 0.40);
        produtos.put("abacate", 1.5);
        System.out.println(produtos);
        */

        }
    }
}
