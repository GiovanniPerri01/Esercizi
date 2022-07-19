package school.devskill.GiocoDellOca.ElementiDiGioco;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@ToString
public class Player{

    private final String name;
    private int nLanci;
    private int posizione;
    private boolean stop;
    private int ultimoTiro;

    public Player(String name) {
        this.name = name;
    }

    public void aggiungiLancio(){
        this.nLanci++;
    }

}

