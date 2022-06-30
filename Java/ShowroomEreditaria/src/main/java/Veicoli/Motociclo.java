package Veicoli;


import Veicoli.Motocicli.Limitata;
import Veicoli.Motocicli.Pista;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Motociclo extends Veicolo{
    private Limitata limitata;
    private Pista daPista;

    public Motociclo(String nome, String marca, Integer prezzo, Integer annoP, Limitata limitata, Pista daPista) {
        super(nome, marca, prezzo, annoP);
        this.limitata = limitata;
        this.daPista = daPista;
    }
}
