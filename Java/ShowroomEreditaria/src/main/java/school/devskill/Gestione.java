package school.devskill;

import Veicoli.Automobile;
import Veicoli.Motociclo;

import java.util.ArrayList;
import java.util.List;

public class Gestione {
    public static List<Motociclo> motocicli = new ArrayList<>();
    public static List<Automobile> automobili = new ArrayList<>();

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
        int sommaAuto = 0;
        int sommaMoto = 0;
        int sommaTotale = 0;
        int lunghezzaAuto = automobili.size();
        int lunghezzaMoto = motocicli.size();
        int lunghezzaTotale = automobili.size() + motocicli.size();

        for(int i = 0; i < automobili.size(); i++){
            sommaAuto += automobili.get(i).getPrezzo();
        }

        for(int i = 0; i < motocicli.size(); i++){
            sommaMoto += motocicli.get(i).getPrezzo();
        }

        sommaTotale = sommaAuto + sommaMoto;
        System.out.println("La media totale di tutti i veicoli e': " + sommaTotale/lunghezzaTotale);
        System.out.println("La media delle auto e': " + sommaAuto/lunghezzaAuto);
        System.out.println("La media delle moto e': " + sommaMoto/lunghezzaMoto);
    }

    public static void controlloMoto(){
        for(int i = 0; i < motocicli.size(); i++){
            Motociclo moto = motocicli.get(i);
            String output = "La moto ";
            if(moto.getDaPista().getDaPista()){
                output += moto.getNome() + " ha il cambio " +
                        moto.getDaPista().getCambio() +", le gomme " +
                        moto.getDaPista().getTipoGomme() + " per " +
                        moto.getDaPista().getStagioneGomme();
                if(moto.getLimitata().getLimitata()){
                    output += ", la sua edizione e' l'" + moto.getLimitata().getEdizione();
                }
                System.out.println(output);
            }
            else if(moto.getLimitata().getLimitata()){
                output = "L'edizione della moto " + moto.getNome() + " e'" +
                        " l'" + moto.getLimitata().getEdizione();
                System.out.println(output);
            }
        }
    }
    public static void calcoli(){
        vecchio();
        nuovo();
        media();
    }
}
