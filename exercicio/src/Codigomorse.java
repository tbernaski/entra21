import java.util.Scanner;

public class Codigomorse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letra = ' ';
        String letraMorse = " ";
        String mensagemMorse = "";

        System.out.print("Digite uma mensagem: ");
        String mensagem = in.nextLine();

        for (int i = 0; i < mensagem.length(); i++) {
            letra = mensagem.charAt(i);
            if (Character.isLetter(letra) || Character.isDigit(letra)) {

                switch (letra) {
                    case 'a':
                        letraMorse = ".-";
                        break;
                    case 'b':
                        letraMorse = "-...";
                        break;
                    case 'c':
                        letraMorse = "-.-.";
                        break;
                    case 'd':
                        letraMorse = "-..";
                        break;
                    case 'e':
                        letraMorse = ".";
                        break;
                    case 'f':
                        letraMorse = "..-.";
                        break;
                    case 'g':
                        letraMorse = "--.";
                        break;
                    case 'h':
                        letraMorse = "....";
                        break;
                    case 'i':
                        letraMorse = "..";
                        break;
                    case 'j':
                        letraMorse = ".---";
                        break;
                    case 'k':
                        letraMorse = "-.-";
                        break;
                    case 'l':
                        letraMorse = ".-..";
                        break;
                    case 'm':
                        letraMorse = "--";
                        break;
                    case 'n':
                        letraMorse = "-.";
                        break;
                    case 'o':
                        letraMorse = "---";
                        break;
                    case 'p':
                        letraMorse = ".--.";
                        break;
                    case 'q':
                        letraMorse = "--.-";
                        break;
                    case 'r':
                        letraMorse = ".-.";
                        break;
                    case 's':
                        letraMorse = "...";
                        break;
                    case 't':
                        letraMorse = "-";
                        break;
                    case 'u':
                        letraMorse = "..-";
                        break;
                    case 'v':
                        letraMorse = "...-";
                        break;
                    case 'w':
                        letraMorse = ".--";
                        break;
                    case 'x':
                        letraMorse = "-..-";
                        break;
                    case 'y':
                        letraMorse = "-.--";
                        break;
                    case 'z':
                        letraMorse = "--..";
                        break;
                    case '1':
                        letraMorse = ".----";
                        break;
                    case '2':
                        letraMorse = "..---";
                        break;
                    case '3':
                        letraMorse = "...--";
                        break;
                    case '4':
                        letraMorse = "....-";
                        break;
                    case '5':
                        letraMorse = ".....";
                        break;
                    case '6':
                        letraMorse = "-....";
                        break;
                    case '7':
                        letraMorse = "--...";
                        break;
                    case '8':
                        letraMorse = "---..";
                        break;
                    case '9':
                        letraMorse = "----.";
                        break;
                    case '0':
                        letraMorse = "-----";
                        break;
                }
            } else if (letra == ' ') {
                letraMorse = "*";
            }
            if (i == mensagem.length() - 1) {
                mensagemMorse += letraMorse;
            }else {
                mensagemMorse += letraMorse+"|";
            }
        }
        System.out.println(mensagemMorse);
}
}

