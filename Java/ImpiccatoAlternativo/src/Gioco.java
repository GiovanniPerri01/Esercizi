import java.lang.reflect.Array;
import java.util.*;

public class Gioco{
    public static String parola;
    public static String parolaNascosta = "*";
    public static int tentativi = 5;
    private static String[] parolaSplittata;
    private static List<String> lettereSeparate = new ArrayList<>();

    public static String nascondiParola(){
        for(int i = 0; i<parola.length()-1; i++){
            parolaNascosta += "*";
        }
        return parolaNascosta;
    }

    public static void splitParola(){
        parolaSplittata = parola.split("");
        for(int i = 0; i < parolaSplittata.length; i++) {
            lettereSeparate.add(parolaSplittata[i]);
        }
    }

    public static String controlloLettera(String lettera){
        boolean v = false;

        for(int i = 0; i < parolaSplittata.length; i++){
            if(parolaSplittata[i].equals(lettera)){
                v = true;
                parolaNascosta = parolaNascosta.substring(0,i) + lettera + parolaNascosta.substring(i +1);
                lettereSeparate.remove(lettera);
            }
        }

        if(!v){
            Random random = new Random();
            tentativi -= 1;
            String indizio = lettereSeparate.get(random.nextInt(lettereSeparate.size()));
            System.out.println("Indizio: la parola contiene la lettera " + "'" + indizio + "'");
        }

        return "Parola: " +
                parolaNascosta
                + ", Tentativi rimasti: " + tentativi;
    }

}
