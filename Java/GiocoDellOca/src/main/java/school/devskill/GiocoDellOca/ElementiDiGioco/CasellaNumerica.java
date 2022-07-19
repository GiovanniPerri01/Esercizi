package school.devskill.GiocoDellOca.ElementiDiGioco;

import lombok.ToString;

@ToString
public class CasellaNumerica implements ICasellaSpeciale {

    private final int imprevisto;

    public CasellaNumerica(int imprevisto){
        this.imprevisto = imprevisto;
    }

    @Override
    public boolean isStop() {
        return false;
    }

    @Override
    public int calcolaPosizione(int posizioneGiocatore){
        return imprevisto == 0 ? 0 : (posizioneGiocatore + imprevisto);
    }
}