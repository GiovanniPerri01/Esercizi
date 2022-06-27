package Veicoli;

public class Motociclo{
    private String nome;
    private String marca;
    private Integer annoP;
    private Integer prezzo;
    private Boolean daPista;
    private Boolean limitata;

    public Motociclo(String nome, String marca, Integer annoP, Integer prezzo, Boolean daPista, Boolean limitata) {
        this.nome = nome;
        this.marca = marca;
        this.annoP = annoP;
        this.prezzo = prezzo;
        this.daPista = daPista;
        this.limitata = limitata;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnnoP(Integer annoP) {
        this.annoP = annoP;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }

    public void setDaPista(Boolean daPista) {
        this.daPista = daPista;
    }

    public void setLimitata(Boolean limitata) {
        this.limitata = limitata;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAnnoP() {
        return annoP;
    }

    public Integer getPrezzo() {
        return prezzo;
    }

    public Boolean getDaPista() {
        return daPista;
    }

    public Boolean getLimitata() {
        return limitata;
    }
}
