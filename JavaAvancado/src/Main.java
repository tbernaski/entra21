import javax.xml.stream.events.EndElement;
import java.util.ArrayList;    //add, get, remove
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        //Pedir ao usuário n números inteiros até ele digitar 0
        // Qdo ele digigtar 0, mostrar a lista dos números digitados por ele
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Digite um número inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: ");
        // ou tira o for e adiciona só = sout (inteiros);
        for (int i = 0; i < inteiros.size(); i++) {
            if (i > 0 && i < inteiros.size()) {
                System.out.print(", ");
            }
            System.out.print(inteiros.get(i));
        }
    }

    public static void ex0() {
        ArrayList arr = new ArrayList();
        arr.add(new ArrayList());
        arr.add(new ArrayList());
    }

    public static void ex2() {
        ArrayList inteiros = new ArrayList();
        int somaPar = 0, somaImpar = 0, somaTotal = 0;
        while (true) {
            System.out.print("Digite um número inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somaPar += escolha;
            } else {
                somaImpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + inteiros);
        System.out.println("A soma dos números pares é: " + somaPar);
        System.out.println("A soma dos números impares é: " + somaPar);
        System.out.println("A média dos valores informados é: " + (somaTotal / inteiros.size()));
    }


    public static void ex3() {
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.print("Informe as palavras e digite 0 para sair: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("0")) {
                break;
            }
            palavras.add(input);
        }
        for (int i = 0; i < palavras; i--) {
            if ( ==0){
            }
            System.out.println("Lista de palavras: " + palavras);
        }
    }
}












/* Classe Rapper
int - Integer
double - Double
char - Character
boolean - Boolean




 */