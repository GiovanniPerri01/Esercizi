package school.devskill;

import Veicoli.Automobile;
import Veicoli.Motociclo;

public class App
{
    public static void main(String[] args) {
        Gestione.automobili.add(new Automobile("A3", "Audi", 35000, 2012, 1000));
        Gestione.automobili.add(new Automobile("Stelvio", "Alfa Romeo", 50000, 2021, 980));
        Gestione.automobili.add(new Automobile("GLK", "Mercedes", 80000, 2022, 1200));
        Gestione.automobili.add(new Automobile("Punto", "Fiat", 10000, 2008, 850));

        Gestione.motocicli.add(new Motociclo("Ninja 300", "Kawasaki", 5000, 2013, false, false));
        Gestione.motocicli.add(new Motociclo("Monster", "Ducati", 4000, 2011, false, false));
        Gestione.motocicli.add(new Motociclo("RS250R", "Honda", 7500, 2018, false, true));
        Gestione.motocicli.add(new Motociclo("V7", "Guzzi", 10000, 2007, true, false));
        Gestione.motocicli.add(new Motociclo("Tuono V4X", "Aprilia", 15000, 2020, true, true));

        RivalutazionePrezzi.rivalutaAuto();
        RivalutazionePrezzi.rivalutaMoto();
        Gestione.calcoli();
    }
}
