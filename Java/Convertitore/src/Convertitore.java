import java.util.Locale;
import java.util.Scanner;

public class Convertitore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conversione valori = new Conversione();


        System.out.println("Inserisci unita' di misura(c, f, k, m): ");
        valori.conv = scanner.nextLine().toString().toLowerCase();
        System.out.println("Inserisci numero da convertire:");
        valori.numero = scanner.nextDouble();

        valori.calcolo();
    }
}
