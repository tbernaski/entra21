import java.util.Scanner;

public class exercício4_dia16_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else if (j >4) {
                    System.out.print(Math.abs(j - 3));
                }else{
                    System.out.print(Math.abs(j-5));
                }
            }
            System.out.println("");
        }
    }
}