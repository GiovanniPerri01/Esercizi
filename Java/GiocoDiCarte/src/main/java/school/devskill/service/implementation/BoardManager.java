package school.devskill.service.implementation;

import school.devskill.elementidigioco.Card;
import school.devskill.elementidigioco.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BoardManager {
    private final Card[][] tavolo = new Card[2][5];
    private final List<Card> mazzo1;
    private final List<Card> mazzo2;
    private Player p1;
    private Player p2;
    private final List<Card> manoP1;
    private final List<Card> manoP2;
    private int cont = 14;

    public BoardManager(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
        this.mazzo1 = new ArrayList<>();
        this.mazzo2 = new ArrayList<>();
        this.manoP1 = new ArrayList<>();
        this.manoP2 = new ArrayList<>();
        riempiMazzi();
    }

    public void riempiMazzi(){
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            int atk = random.nextInt(1,12);
            int def = random.nextInt(1,12);
            mazzo1.add(new Card(atk, def));
            atk = random.nextInt(1,12);
            def = random.nextInt(1,12);
            mazzo2.add(new Card(atk, def));
        }
    }

    public String daiCarta(){
        manoP1.add(mazzo1.get(this.cont));
        manoP2.add(mazzo2.get(this.cont));
        mazzo1.remove(this.cont);
        mazzo2.remove(this.cont);
        cont--;
        String str = "Mano primo giocatore: " + manoP1.toString() + ", mano del secondo giocatore: " + manoP2;
        return str;
    }

    public int Turno(){
        daiCarta();
        return 0;
    }

}
