import java.util.Scanner;

public class Impiccato {
    public static void main(String[] args) {

        Gioco.parola = "ciao";
        System.out.println("La parola e': " + Gioco.nascondiParola());
        Scanner input = new Scanner(System.in);

        while(Gioco.tentativi > 0 && Gioco.parolaNascosta.contains("*")){
            System.out.println("Inserisci lettera: ");
            System.out.println(Gioco.controlloLettera(input.nextLine()));
        }
        if(Gioco.tentativi == 0){
            System.out.println("Hai perso! :(");
        }
        if (!Gioco.parolaNascosta.contains("*")) {
            System.out.println("Hai vinto! :)");
        }

    }
}
