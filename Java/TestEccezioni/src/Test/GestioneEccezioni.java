package Test;

public class GestioneEccezioni {
    public static int valore;

    public GestioneEccezioni(){

    }

    public static void funzione(int numero) throws Exception {
        if (valore <= 0){
            throw new Exception();
        }
    }
}
