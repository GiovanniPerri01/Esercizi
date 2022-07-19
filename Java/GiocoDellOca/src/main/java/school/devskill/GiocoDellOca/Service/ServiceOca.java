package school.devskill.GiocoDellOca.Service;

import org.springframework.stereotype.Service;
import school.devskill.GiocoDellOca.Eccezioni.AzioneNonPermessaException;
import school.devskill.GiocoDellOca.Eccezioni.GiocoInCorsoException;
import school.devskill.GiocoDellOca.ElementiDiGioco.CasellaNumerica;
import school.devskill.GiocoDellOca.ElementiDiGioco.CasellaStop;
import school.devskill.GiocoDellOca.ElementiDiGioco.ICasellaSpeciale;
import school.devskill.GiocoDellOca.ElementiDiGioco.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ServiceOca {
    private final List<Player> players;
    private final List<ICasellaSpeciale> caselle;
    private final int dimensioneBoard = 14;
    private boolean isOver = false;
    private boolean inCorso;
    private String vincitore;

    public ServiceOca() {
        this.players = new ArrayList<>();
        this.caselle = new ArrayList<>();
        inCorso = false;
        creaBoard();
    }

    public String addPlayer(Player p) throws GiocoInCorsoException {
        if(inCorso){
            throw new GiocoInCorsoException();
        }
        else{
            players.add(p);
        }
        return "Giocatore aggiunto";
    }

    public String statoPartita(){
        return players.toString();
    }

    public int throwsDice(){
        Random random = new Random();
        return random.nextInt(7 -1) +1;
    }

    public String giocaTurno(){
        if(!inCorso){
            inCorso = true;
        }

        for(int i =0; i < players.size(); i++){
            Player corrente = players.get(i);

            if(!corrente.isStop()){

                int risultatoDado = throwsDice();
                int casellaDiArrivoTmp = corrente.getPosizione() + risultatoDado;

                corrente.setUltimoTiro(risultatoDado);

                if(casellaDiArrivoTmp >= dimensioneBoard){
                    isOver = true;
                    vincitore = corrente.getName();
                    break;
                }

                ICasellaSpeciale casellaArrivo = caselle.get(casellaDiArrivoTmp) ;

                if(casellaArrivo != null){
                    try{
                        casellaDiArrivoTmp = casellaArrivo.calcolaPosizione(casellaDiArrivoTmp);
                    }
                    catch(AzioneNonPermessaException e){
                        e.printStackTrace();
                        corrente.setStop(true);
                    }
                    finally {
                        corrente.aggiungiLancio();
                        corrente.setPosizione(casellaDiArrivoTmp);
                    }
                }
                corrente.aggiungiLancio();
                corrente.setPosizione(casellaDiArrivoTmp);

            }
            else{
                corrente.setStop(false);
            }
        }

        if(isOver){
            inCorso = false;
            return vincitore + " e' il vincitore!";
        }
        else{
            return "Turno concluso: " + players;
        }
    }

    public String reset(){
        isOver = false;
        for(int i = 0; i < players.size(); i++){
            Player corrente = players.get(i);
            corrente.setPosizione(0);
            corrente.setNLanci(0);
            corrente.setStop(false);
        }
        return "Gioco resettato";
    }

    private void creaBoard(){
        for(int i = 0; i < dimensioneBoard; i++){
            switch (i){
                case 1: caselle.add(new CasellaNumerica(2)); break;
                case 5: caselle.add(new CasellaNumerica(-1)); break;
                case 7: caselle.add(new CasellaNumerica(3)); break;
                case 8: caselle.add(new CasellaNumerica(0)); break;
                case 9: caselle.add(new CasellaStop()); break;
                case 12: caselle.add(new CasellaNumerica(-3)); break;
                default: caselle.add(null);
            }
        }
    }
}