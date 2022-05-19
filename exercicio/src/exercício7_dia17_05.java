import java.util.Scanner;

public class exercício7_dia17_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }
} //tradutor de codigo morse