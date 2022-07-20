package school.devskill.eccezioni;

public class CartaInesistenteException extends RuntimeException{
    public CartaInesistenteException(){
        super("La carta scelta non esiste");
    }
}
