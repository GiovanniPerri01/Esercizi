package school.devskill.GiocoDellOca.ElementiDiGioco;

import school.devskill.GiocoDellOca.Eccezioni.AzioneNonPermessaException;

public interface ICasellaSpeciale {
    boolean isStop();
    int calcolaPosizione(int posizioneGiocatore) throws AzioneNonPermessaException;
}
