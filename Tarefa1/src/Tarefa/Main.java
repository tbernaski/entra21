package Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tarefa t = new Tarefa();

        System.out.print("Digite o nome da tarefa: ");
        t.setNome(in.nextLine());

        System.out.print("Digite a descrição da tarefa: ");
        t.setDescricao(in.nextLine());

        System.out.println(t.getUuid());
        System.out.println(t.getNome());
        System.out.println(t.getDescricao());
    }
}