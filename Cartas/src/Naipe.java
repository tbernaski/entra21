public enum Naipe {
    ESPADAS("Espadas"),
    PAUS("Paus"),
    COPAS("Copas"),
    OURO("Ouro");

    private String Naipe;

    Naipe(String naipe){

    }


//getters e setters
    public String getNaipe() {
        return Naipe;
    }

    public void setNaipe(String naipe) {
        Naipe = naipe;
    }
}
