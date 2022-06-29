public enum ValorCarta {
    UM("1"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    ONZE("11"),
    DOZE("12");

    private String valor;

    ValorCarta(String valorCarta){

 }


    //getters e setters
    public String getValorCarta() {
        return ValorCarta;
    }

    public void setValorCarta(String valorCarta) {
        ValorCarta = valorCarta;
    }
}
