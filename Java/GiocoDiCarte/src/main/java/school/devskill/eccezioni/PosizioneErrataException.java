package school.devskill.eccezioni;

public class PosizioneErrataException extends RuntimeException{
    public PosizioneErrataException(){
        super("La posizione inserita va oltre la capacita' della board");
    }
}
