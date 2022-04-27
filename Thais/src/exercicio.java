public class exercicio {

    public static void main(String[] args) {
        exerc01();
    }

    public static void exerc01() {
            int varA = 10;
            int varB = 20;
            int varC = varA;
            varA = varB;
            varA = varC;
        System.out.println(varA);
        System.out.println(varB);
    }
}
