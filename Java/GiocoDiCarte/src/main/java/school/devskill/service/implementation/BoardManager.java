package school.devskill.service.implementation;

import lombok.ToString;
import org.springframework.stereotype.Service;
import school.devskill.command.PlayersCommand;
import school.devskill.command.TurnoCommand;
import school.devskill.eccezioni.CartaGiaPresenteException;
import school.devskill.eccezioni.CartaInesistenteException;
import school.devskill.eccezioni.PosizioneErrataException;
import school.devskill.elementidigioco.Card;
import school.devskill.elementidigioco.Player;
import school.devskill.service.interfaces.IBoardManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@ToString
@Service
public class BoardManager implements IBoardManager {
    private final Card[][] tavolo = new Card[2][5];
    private final List<Card> mazzo1;
    private final List<Card> mazzo2;
    private Player p1;
    private Player p2;
    private final List<Card> manoP1;
    private final List<Card> manoP2;
    private int cont = 14;
    private String statoPartita = "";

    public BoardManager(){
        this.mazzo1 = new ArrayList<>();
        this.mazzo2 = new ArrayList<>();
        this.manoP1 = new ArrayList<>();
        this.manoP2 = new ArrayList<>();
        this.p1 = new Player();
        this.p2 = new Player();
        for(int i = 0; i < 5; i++){
            tavolo[0][i]= new Card(0,0);
            tavolo[1][i]= new Card(0,0);
        }
        riempiMazzi();
        daiCarta();
    }

    @Override
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

    @Override
    public String daiCarta(){
        if(manoP1.size() <5){
            manoP1.add(mazzo1.get(this.cont));
        }
        if(manoP2.size() < 5){
            manoP2.add(mazzo2.get(this.cont));
        }
        mazzo1.remove(this.cont);
        mazzo2.remove(this.cont);
        cont--;
        return statoPartita();
    }

    @Override
    public String posizionaCarta1(Integer posCard, Integer posOnBoard, Integer player) throws PosizioneErrataException, CartaInesistenteException, CartaGiaPresenteException {
        if(posCard >=5){
            throw new CartaInesistenteException();
        }
        if(posOnBoard >=5){
            throw new PosizioneErrataException();
        }
        if(player == 1 && tavolo[0][posOnBoard].getAtk() == 0 && tavolo[0][posOnBoard].getDef() == 0){
            tavolo[0][posOnBoard] = manoP1.get(posCard);
        }
        else{
            throw new CartaGiaPresenteException();
        }
        return statoPartita();
    }

    @Override
    public String posizionaCarta2(Integer posCard, Integer posOnBoard, Integer player) throws PosizioneErrataException, CartaInesistenteException, CartaGiaPresenteException {
        if(posCard >=5){
            throw new CartaInesistenteException();
        }
        if(posOnBoard >=5){
            throw new PosizioneErrataException();
        }
        if(player == 2 && tavolo[1][posOnBoard].getAtk() == 0 && tavolo[1][posOnBoard].getDef() == 0){
            tavolo[1][posOnBoard] = manoP2.get(posCard);
        }
        else{
            throw new CartaGiaPresenteException();
        }
        return statoPartita();
    }

    @Override
    public String faseAttacco1(){
        Integer danno = 0;
        for(int i = 0; i < 5; i++) {
            danno = tavolo[0][i].getAtk() - tavolo[1][i].getDef();
            if (danno > 0) {
                p2.setHP(p2.getHP() - danno);
            } else if (danno == 0) {
                tavolo[1][i].setDef(0);
                tavolo[1][i].setAtk(0);
            } else {
                tavolo[1][i].setDef(tavolo[1][i].getDef() - tavolo[0][i].getAtk());
            }
        }
        return statoPartita();
    }

    @Override
    public String faseAttacco2(){
        Integer danno = 0;
        for(int i = 0; i < 5; i++){
            danno = tavolo[1][i].getAtk() - tavolo[0][i].getDef();
            if(danno > 0){
                p1.setHP(p1.getHP() - danno);
            }
            else if(danno == 0){
                tavolo[0][i].setDef(0);
                tavolo[0][i].setAtk(0);
            }
            else{
                tavolo[0][i].setDef(tavolo[0][i].getDef() - tavolo[1][i].getAtk());
            }
        }
        return statoPartita();
    }

    @Override
    public String giocaTurno(TurnoCommand turno){
        daiCarta();
        if(turno.getPlc1()){
            posizionaCarta1(turno.getPosCard1(), turno.getPosOnBoard1(), 1);
        }
        if(turno.getPlc2()){
            posizionaCarta2(turno.getPosCard2(), turno.getPosOnBoard2(), 2);
        }
        if(turno.getAttacco1()){
            faseAttacco1();
        }
        if(turno.getAttacco2()){
            faseAttacco2();
        }

        if(p1.getHP()<=0){
            return p2.getName() + " ha vinto!";
        }
        if(p2.getHP()<=0){
            return p1.getName() + " ha vinto!";
        }
        return statoPartita();
    }

    @Override
    public String reset(){
        this.statoPartita = "";
        for(int i = 0; i < manoP1.size(); i++){
           manoP1.remove(i);
           manoP2.remove(i);
        }
        for(int i = 0; i < mazzo1.size(); i++){
            mazzo1.remove(i);
            mazzo2.remove(i);
        }
        p1.setHP(50);
        p2.setHP(50);
        return "Gioco resettato!";
    }

    @Override
    public String statoPartita(){
        String strTavolo = "";
        for(int i = 0; i < 5; i++){
            strTavolo += this.tavolo[0][i].toString() + " ";
        }
        strTavolo += "\n";
        for(int i = 0; i < 5; i++){
            strTavolo += this.tavolo[1][i].toString() + " ";
        }
        this.statoPartita = p1.getName() + " ha " +
                p1.getHP() + " HP, la sua mano é:\n"+ manoP1 + "\n" + p2.getName() + " ha " +
                p2.getHP() + " HP, la sua mano é:\n" + manoP2;
        return  "Tavolo:\n'" + strTavolo + "\n\n" + this.statoPartita;
    }

    @Override
    public String addPlayers(PlayersCommand players){
        this.p1.setName(players.getPlayer1());
        this.p2.setName(players.getPlayer2());
        return "Giocatori aggiunti";
    }
}
