package Veicoli;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Veicoli.automobili.add(new Automobile("A3", "Audi", 1000, 2012, 35000));
        Veicoli.automobili.add(new Automobile("Stelvio", "Alfa Romeo", 980, 2021, 50000));
        Veicoli.automobili.add(new Automobile("GLK", "Mercedes", 1200, 2022, 80000));
        Veicoli.automobili.add(new Automobile("Punto", "Fiat", 850, 2008, 10000));

        Veicoli.motocicli.add(new Motociclo("Ninja 300", "Kawasaki", 2013, 5000, false, false));
        Veicoli.motocicli.add(new Motociclo("Monster", "Ducati", 2011, 4000, false, false));
        Veicoli.motocicli.add(new Motociclo("RS250R", "Honda", 2018, 7500, true, false));
        Veicoli.motocicli.add(new Motociclo("V7", "Guzzi", 2020, 10000, false, true));

        Veicoli.vecchio();
        Veicoli.nuovo();
        Veicoli.media();
    }
}
