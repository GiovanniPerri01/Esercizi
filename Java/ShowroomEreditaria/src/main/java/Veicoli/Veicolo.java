package Veicoli;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Veicolo {
    private String nome;
    private String marca;
    private Integer prezzo;
    private Integer annoP;
}
