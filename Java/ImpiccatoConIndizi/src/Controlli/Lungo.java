package Controlli;

public class Lungo extends Exception{
    public Lungo() {
        super("E' stato inserito piu' di un carattere!" + "\r\n");
    }
}
