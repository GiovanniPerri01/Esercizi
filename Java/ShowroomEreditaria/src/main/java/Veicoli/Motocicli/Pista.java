package Veicoli.Motocicli;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pista {
    private Boolean daPista;
    private String cambio = null;
    private String tipoGomme = null;
    private String stagioneGomme = null;
}
