package Veicoli;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Automobile extends Veicolo{
    private Integer cilindrata;

    public Automobile(String nome, String marca, Integer prezzo, Integer annoP, Integer cilindrata) {
        super(nome, marca, prezzo, annoP);
        this.cilindrata = cilindrata;
    }
}
