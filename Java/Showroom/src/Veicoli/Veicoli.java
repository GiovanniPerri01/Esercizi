package Veicoli;

import java.util.ArrayList;
import java.util.List;

public class Veicoli {
    public static ArrayList<Automobile> automobili = new ArrayList<>();
    public static ArrayList<Motociclo> motocicli = new ArrayList<>();

    public static void vecchio(){
        int old = automobili.get(0).getAnnoP();
        int posizione = 0;
        boolean v = false;

        for(int i = 0; i < automobili.size(); i++){
            if(automobili.get(i).getAnnoP() < old){
                old = automobili.get(i).getAnnoP();
                posizione = i;
            }
        }

        for(int i = 0; i < motocicli.size(); i++){
            if(motocicli.get(i).getAnnoP() < old){
                old = motocicli.get(i).getAnnoP();
                posizione = i;
                v = true;
            }
        }

        if(v){
            System.out.println("Il veicolo piu vecchio e': " + motocicli.get(posizione).getMarca() + " " + motocicli.get(posizione).getNome());
        }
        else{
            System.out.println("Il veicolo piu vecchio e': " + automobili.get(posizione).getMarca() + " " + automobili.get(posizione).getNome());
        }
    }

    public static void nuovo(){
        int nuovo = automobili.get(0).getAnnoP();
        int posizione = 0;
        boolean v = false;

        for(int i = 0; i < automobili.size(); i++){
            if(automobili.get(i).getAnnoP() > nuovo){
                nuovo = automobili.get(i).getAnnoP();
                posizione = i;
            }
        }

        for(int i = 0; i < motocicli.size(); i++){
            if(motocicli.get(i).getAnnoP() > nuovo){
                nuovo = motocicli.get(i).getAnnoP();
                posizione = i;
                v = true;
            }
        }

        if(v){
            System.out.println("Il veicolo piu nuovo e': " + motocicli.get(posizione).getMarca() + " " + motocicli.get(posizione).getNome());
        }
        else{
            System.out.println("Il veicolo piu nuovo e': " + automobili.get(posizione).getMarca() + " " + automobili.get(posizione).getNome());
        }
    }

    public static void media(){
        int somma = 0;
        int lunghezza = automobili.size() + motocicli.size();

        for(int i = 0; i < automobili.size(); i++){
            somma += automobili.get(i).getPrezzo();
        }
        for(int i = 0; i < motocicli.size(); i++){
            somma += motocicli.get(i).getPrezzo();
        }

        System.out.println("La media totale di tutti i veicoli e': " + somma/lunghezza);
    }

}
