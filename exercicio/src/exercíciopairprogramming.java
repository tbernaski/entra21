import java.util.Scanner;

public class exercíciopairprogramming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int alunos = in.nextInt();
        System.out.print("Digite o número de questões da prova: ");
        int questoes = in.nextInt();
        char[] resposta = new char[questoes];
        String temp = " ";
        char[] respostaAluno = new char[questoes];
        int cont = 0;
        String[] nome = new String[alunos];

        double[] notas = new double[alunos];
        System.out.println(" ");
        System.out.println("Gabarito");
        for (int i = 0; i < questoes; i++) {           //gabarito
            System.out.print("Resposta " + (i + 1) + ":  ");
            temp = in.next().toUpperCase();
            resposta[i] = temp.charAt(0);
            while (temp.length() > 1) {
                System.out.println("A resposta é inválida");
                System.out.print("Digite novamente: ");
                temp = in.next().toUpperCase();
                resposta[i] = temp.charAt(0);
            }
        }
        for (int i = 0; i < alunos; i++) {
            System.out.println(" ");
            in.nextLine();
            System.out.print("Digite o nome do aluno: ");
            nome[i] = in.nextLine();
            for (int j = 0; j < questoes; j++) {      //resposta do aluno
                System.out.print("Resposta " + (j + 1) + ":  ");
                temp = in.next().toUpperCase();
                respostaAluno[j] = temp.charAt(0);
                while (temp.length() > 1) {
                    System.out.println("A resposta é inválida");
                    System.out.print("Digite novamente: ");
                    temp = in.next().toUpperCase();
                    respostaAluno[j] = temp.charAt(0);
                }
                for (int k = 0; k < questoes; k++) {
                    if (respostaAluno[k] == resposta[k]) { //Analisando as respostas
                        cont++;
                    }
                }
                notas[i] = (10 / questoes) * cont; //Cálculo
                cont = 0;
            }
        }
            System.out.println(" ");
            for (int i = 0; i < alunos; i++) {
                System.out.println("Nota " + nome[i] + ": " + notas[i]); //Mostrando as notas
            }
    }
}