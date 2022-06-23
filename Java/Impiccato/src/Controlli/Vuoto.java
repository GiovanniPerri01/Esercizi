package Controlli;

public class Vuoto extends Exception{
    public Vuoto(){
        super("E' stato inserito un carattere vuoto!" + "\r\n");
    }
}
