package school.devskill;

import Veicoli.Automobile;
import Veicoli.Motociclo;

public class RivalutazionePrezzi {
    public static void rivalutaAuto(){
        for(int i = 0; i < Gestione.automobili.size(); i++){
            Automobile auto = Gestione.automobili.get(i);
            if(2022 - auto.getAnnoP() >= 10){
                int riduzione = (auto.getPrezzo() * 10) / 100;
                auto.setPrezzo(auto.getPrezzo() - riduzione);
            }
        }
    }

    public static void rivalutaMoto(){
        for(int i = 0 ; i < Gestione.motocicli.size(); i++){
            Motociclo moto = Gestione.motocicli.get(i);
            if(moto.getDaPista()){
                int aumento = (moto.getPrezzo() * 15) / 100;
                if(moto.getLimitata()){
                    aumento = (aumento * 25) / 100;
                }
                moto.setPrezzo(moto.getPrezzo() + aumento);
            }
            else if(moto.getLimitata()){
                int aumento = (moto.getPrezzo() * 25) / 100;
                moto.setPrezzo(moto.getPrezzo() + aumento);
            }
            System.out.println(moto.getPrezzo());
        }
    }
}
