package school.devskill.service.interfaces;

import school.devskill.command.PlayersCommand;
import school.devskill.command.TurnoCommand;
import school.devskill.eccezioni.CartaGiaPresenteException;
import school.devskill.eccezioni.CartaInesistenteException;
import school.devskill.eccezioni.PosizioneErrataException;

public interface IBoardManager{
    void riempiMazzi();
    String daiCarta();
    String posizionaCarta1(Integer posCard, Integer posOnBoard, Integer player) throws PosizioneErrataException, CartaInesistenteException, CartaGiaPresenteException;
    String posizionaCarta2(Integer posCard, Integer posOnBoard, Integer player) throws PosizioneErrataException, CartaInesistenteException, CartaGiaPresenteException;

    String faseAttacco1();
    String faseAttacco2();
    String giocaTurno(TurnoCommand turno);
    String reset();
    String statoPartita();
    String addPlayers(PlayersCommand players);
}
