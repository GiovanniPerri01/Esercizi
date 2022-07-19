package school.devskill.GiocoDellOca.ElementiDiGioco;

import lombok.ToString;
import school.devskill.GiocoDellOca.Eccezioni.AzioneNonPermessaException;

@ToString
public class CasellaStop implements ICasellaSpeciale{

    @Override
    public boolean isStop(){
        return true;
    }

    @Override
    public int calcolaPosizione(int posizioneGiocatore) {
        throw new AzioneNonPermessaException();
    }

}