package school.devskill;

import Veicoli.Automobile;
import Veicoli.Motociclo;

import java.util.ArrayList;
import java.util.List;

public class Gestione {
    public static List<Motociclo> motocicli = new ArrayList<>();
    public static List<Automobile> automobili = new ArrayList<>();

    public static String vecchio(){
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
            return "Il veicolo piu vecchio e': " + motocicli.get(posizione).getMarca() + " " + motocicli.get(posizione).getNome();
        }
        else{
            return "Il veicolo piu vecchio e': " + automobili.get(posizione).getMarca() + " " + automobili.get(posizione).getNome();
        }
    }

    public static String nuovo(){
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
            return "Il veicolo piu nuovo e': " + motocicli.get(posizione).getMarca() + " " + motocicli.get(posizione).getNome();
        }
        else{
            return "Il veicolo piu nuovo e': " + automobili.get(posizione).getMarca() + " " + automobili.get(posizione).getNome();
        }
    }

    public static List<String> media(){
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

        List<String> lista = new ArrayList<>();
        lista.add("La media totale di tutti i veicoli e': " + sommaTotale/lunghezzaTotale);
        lista.add("La media delle auto e': " + sommaAuto/lunghezzaAuto);
        lista.add("La media delle moto e': " + sommaMoto/lunghezzaMoto);

        return lista;
    }

    public static List<String> controlloMoto(){
        List<String> lista = new ArrayList<>();
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
                lista.add(output);
            }
            else if(moto.getLimitata().getLimitata()){
                output = "L'edizione della moto " + moto.getNome() + " e'" +
                        " l'" + moto.getLimitata().getEdizione();
                lista.add(output);
            }
        }
        return lista;
    }
}
