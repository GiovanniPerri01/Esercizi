package school.devskill;

import Veicoli.Automobile;
import Veicoli.Motocicli.Limitata;
import Veicoli.Motocicli.Pista;
import Veicoli.Motociclo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App
{
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);

        Gestione.automobili.add(new Automobile("A3", "Audi", 35000, 2012, 1000));
        Gestione.automobili.add(new Automobile("Stelvio", "Alfa Romeo", 50000, 2021, 980));
        Gestione.automobili.add(new Automobile("GLK", "Mercedes", 80000, 2022, 1200));
        Gestione.automobili.add(new Automobile("Punto", "Fiat", 10000, 2008, 850));


        Gestione.motocicli.add(new Motociclo("Ninja 300", "Kawasaki", 5000, 2013,
                new Limitata(false, ""), new Pista(false, "","","")));
        Gestione.motocicli.add(new Motociclo("Monster", "Ducati", 4000, 2011,
                new Limitata(false, ""), new Pista(false, "","","")));
        Gestione.motocicli.add(new Motociclo("RS250R", "Honda", 7500, 2018,
                new Limitata(false,"") ,
                new Pista(true,"normale", "medie", "asciutto")));
        Gestione.motocicli.add(new Motociclo("V7", "Guzzi", 10000, 2007,
                new Limitata(true,"edizione 2") ,
                new Pista(false,"", "", "")));
        Gestione.motocicli.add(new Motociclo("Tuono V4X", "Aprilia", 15000, 2020,
                new Limitata(true,"edizione 4") ,
                new Pista(true,"normale", "dure", "bagnate")));

        RivalutazionePrezzi.rivalutaAuto();
        RivalutazionePrezzi.rivalutaMoto();
    }
}
