package Impiccato;

import Controlli.Lungo;
import Controlli.Numero;
import Controlli.Vuoto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gioco extends Exception{
    public static String parola;
    public static String parolaNascosta = "";
    public static int tentativi = 5;
    public static String numeri = "0123456789";
    private static String[] parolaSplittata;
    private static List<String> lettereSeparate = new ArrayList<>();

    public static String nascondiParola(){
        for(int i = 0; i<parola.length(); i++){
            if(parola.charAt(i) != ' '){
                parolaNascosta += "*";
            }
            else{
                parolaNascosta += " ";
            }

        }
        return parolaNascosta;
    }

    public static void splitParola(){
        parolaSplittata = parola.split("");
        for(int i = 0; i < parolaSplittata.length; i++) {
            if(!parolaSplittata[i].equals(" ")){
                lettereSeparate.add(parolaSplittata[i]);
            }
            else{continue;}
        }
    }

    public static void seVuoto() throws Exception{
        throw new Vuoto();
    }

    public static void seNumero() throws Exception{
        throw new Numero();
    }

    public static void seLungo() throws Exception{
        throw new Lungo();
    }

    public static String controlloLettera(String lettera) throws Exception{
        boolean v = false;
        String[] parolaSplittata = parola.split("");
        int lunghezza = lettera.length();

        if(lettera.isEmpty()){
            seVuoto();
        }
        else if(numeri.contains(lettera)){
            seNumero();
        }
        else if(lunghezza >=2){
            seLungo();
        }
        else{
            for(int i = 0; i < parolaSplittata.length; i++){
                if(parolaSplittata[i].equals(lettera)){
                    v = true;
                    parolaNascosta = parolaNascosta.substring(0,i) + lettera + parolaNascosta.substring(i +1);
                }
            }

            if(!v){
                Random random = new Random();
                tentativi -= 1;
                String indizio = lettereSeparate.get(random.nextInt(lettereSeparate.size()));
                System.out.println("Indizio: la parola contiene la lettera " + indizio);
            }
        }
        return "Parola: " +
                parolaNascosta
                + ", Tentativi rimasti: " + tentativi;

    }

}
