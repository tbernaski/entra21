import java.util.Scanner;

public class DecodificadorMorse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = in.nextLine();
        String[] letraMorse = mensagem.split("\\|");
        String letra = "";
        String mensagemtraduzida = "";

        for (int i = 0; i < letraMorse.length; i++) {



            switch (letraMorse[i]) {
                case ".-":
                    letra = "a";
                    break;
                case "-...":
                    letra = "b";
                    break;
                case "-.-.":
                    letra = "c";
                    break;
                case "-..":
                    letra = "d";
                    break;
                case ".":
                    letra = "e";
                    break;
                case "..-.":
                    letra = "f";
                    break;
                case "--.":
                    letra = "g";
                    break;
                case "....":
                    letra = "h";
                    break;
                case "..":
                    letra = "i";
                    break;
                case ".---":
                    letra = "j";
                    break;
                case "-.-":
                    letra = "k";
                    break;
                case ".-..":
                    letra = "l";
                    break;
                case "--":
                    letra = "m";
                    break;
                case "-.":
                    letra = "n";
                    break;
                case "---":
                    letra = "o";
                    break;
                case ".--.":
                    letra = "p";
                    break;
                case "--.-":
                    letra = "q";
                    break;
                case ".-.":
                    letra = "r";
                    break;
                case "...":
                    letra = "s";
                    break;
                case "-":
                    letra = "t";
                    break;
                case "..-":
                    letra = "u";
                    break;
                case "...-":
                    letra = "v";
                    break;
                case ".--":
                    letra = "w";
                    break;
                case "-..-":
                    letra = "x";
                    break;
                case "-.--":
                    letra = "y";
                    break;
                case "--..":
                    letra = "z";
                    break;
                case ".----":
                    letra = "1";
                    break;
                case "..---":
                    letra = "2";
                    break;
                case "...--":
                    letra = "3";
                    break;
                case "....-":
                    letra = "4";
                    break;
                case ".....":
                    letra = "5";
                    break;
                case "-....":
                    letra = "6";
                    break;
                case "--...":
                    letra = "7";
                    break;
                case "---..":
                    letra = "8";
                    break;
                case "----.":
                    letra = "9";
                    break;
                case "-----":
                    letra = "0";
                    break;
                case "*":
                    letra = " ";
                    break;
                case ".-.-.-":
                    letra = ".";
                    break;
                case "--..--":
                    letra = ",";
                    break;
                case "..--..":
                    letra = "?";
                    break;
                case "-.-.--":
                    letra = "!";
                    break;
            }
            mensagemtraduzida+=letra;
        }
        System.out.println(mensagemtraduzida);
    }
}