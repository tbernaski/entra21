import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class exerciciohoje {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Digite a abreviação da classe Healer: ");
            String clazz = in.next().toUpperCase();

            if (clazz.length() == 3) {
                switch (clazz) {
                    case "PLD", "WAR", "DKN", "GNB":
                        System.out.println("Tank");
                        break;
                    case "WHM", "SCH", "AST", "SAG":
                        System.out.println("Header");
                        break;
                    case "MNR", "DRG", "NJA", "SMR", "RPR", "BRP", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("DPS");
                        break;
                    default:
                        System.out.println("NÃO É HEALER!!!!!");
                        isHealer = false;
                        break;
                }
            } else {
                System.out.println("A abreviação não é válida");
                isHealer = false;
                break;
            }
        }
    }
}