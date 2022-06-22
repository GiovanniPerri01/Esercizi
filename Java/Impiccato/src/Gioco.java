import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Gioco {
    public static String parola;
    public static String parolaNascosta = "*";
    public static int tentativi = 5;

    public static String nascondiParola(){
        for(int i = 0; i<parola.length()-1; i++){
            parolaNascosta += "*";
        }
        return parolaNascosta;
    }

    public static String controlloLettera(String lettera){
        boolean v = false;
        String[] parolaSplittata = parola.split("");

        for(int i = 0; i < parolaSplittata.length; i++){
            if(parolaSplittata[i].equals(lettera)){
                v = true;
                parolaNascosta = parolaNascosta.substring(0,i) + lettera + parolaNascosta.substring(i +1);
            }
        }

        if(!v){
            tentativi -= 1;
        }

        return "Parola: " +
                parolaNascosta
                + ", Tentativi rimasti: " + tentativi;
    }

}
