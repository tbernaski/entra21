package cartas;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Jogo {

    private ArrayList<Carta> handPlayer = new ArrayList<>();
    private ArrayList<Carta> handCPU = new ArrayList<>();
    private Baralho deck = new Baralho();
    private int playerWins;


    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }
}
