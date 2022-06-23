package Impiccato;

import Controlli.Lungo;
import Controlli.Numero;
import Controlli.Vuoto;

import java.util.Scanner;

public class Impiccato {
    public static void main(String[] args) throws Exception {

        Gioco.parola = "ciao come stai";
        System.out.println("La parola e': " + Gioco.nascondiParola());
        Scanner input = new Scanner(System.in);


        while(Gioco.tentativi >= 0 && Gioco.parolaNascosta.contains("*")){
            try{
                System.out.println("Inserisci lettera: ");
                System.out.println(Gioco.controlloLettera(input.nextLine()));
            }catch(Vuoto v){
                System.err.print(v);
            }
            catch(Numero n){
                System.err.print(n);
            }
            catch (Lungo l){
                System.err.print(l);
            }

        }

        if(Gioco.tentativi < 0){
            System.out.println("Hai perso! :(");
            System.out.println("La parola era: " + Gioco.parola);
        }

        if (!Gioco.parolaNascosta.contains("*")) {
            System.out.println("Hai vinto! :)");
        }

    }
}
