import java.util.Scanner;

public class exercício5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número total de eleitores do município: ");
        int eleitores = in.nextInt();

        System.out.print("Digite o número de votos em branco: ");
        int votosembranco = in.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosnulos = in.nextInt();

        int válidos = eleitores - votosembranco - votosnulos;
        double percentVálidos = (válidos*100.0) / eleitores;
        double percentVotosembranco = (votosembranco*100.0) / eleitores;
        double percentVotosnulos = (votosnulos*100.0) / eleitores;

        System.out.printf("%% de votos válidos: %.2f%%\n",+ percentVálidos);
        System.out.printf("%% de votos votos em branco: %.2f%%\n",+ percentVotosnulos);
        System.out.printf("%% de votos votos nulos: %.2f%%\n",+percentVotosnulos);
    }
}
// acho q sim