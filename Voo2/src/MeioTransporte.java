public interface MeioTransporte {    //interface só descrição de método

    public boolean verificaOcupacao(String assento);

    public int quantidadeLivre();

    public void mostrarAssentos();

    public Assento getAssento(String assento);

}