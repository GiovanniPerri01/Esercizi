package school.devskill.eccezioni;

public class CartaGiaPresenteException extends RuntimeException{
    public CartaGiaPresenteException(){
        super("E' gia' stata posizionata una carta in questa posizione");
    }
}
