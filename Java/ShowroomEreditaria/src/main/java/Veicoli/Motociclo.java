package Veicoli;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Motociclo extends Veicolo{
    private Boolean limitata;
    private Boolean daPista;

    public Motociclo(String nome, String marca, Integer prezzo, Integer annoP, Boolean limitata, Boolean daPista) {
        super(nome, marca, prezzo, annoP);
        this.limitata = limitata;
        this.daPista = daPista;
    }
}
