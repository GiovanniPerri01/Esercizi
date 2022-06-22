import java.util.Scanner;

public class Impiccato {
    public static void main(String[] args) {

        Gioco.parola = "barbagianni";
        System.out.println("La parola e': " + Gioco.nascondiParola());
        Scanner input = new Scanner(System.in);
        Gioco.splitParola();

        while(Gioco.tentativi > 0 && Gioco.parolaNascosta.contains("*")){
            System.out.println("Inserisci lettera: ");
            System.out.println(Gioco.controlloLettera(input.nextLine()));
        }
        if(Gioco.tentativi == 0){
            System.out.println("Hai perso! :(");
            System.out.println("La parola era: " + Gioco.parola);
        }
        if (!Gioco.parolaNascosta.contains("*")) {
            System.out.println("Hai vinto! :)");
        }

    }
}
