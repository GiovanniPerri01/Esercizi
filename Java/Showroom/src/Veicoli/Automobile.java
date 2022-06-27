package Veicoli;

public class Automobile {
    private String nome;
    private String marca;
    private Integer cilindrata;
    private Integer annoP;
    private Integer prezzo;

    public Automobile(String nome, String marca, Integer cilindrata, Integer annoP, Integer prezzo) {
        this.nome = nome;
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.annoP = annoP;
        this.prezzo = prezzo;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setAnnoP(Integer annoP) {
        this.annoP = annoP;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public Integer getAnnoP() {
        return annoP;
    }

    public Integer getPrezzo() {
        return prezzo;
    }
}


