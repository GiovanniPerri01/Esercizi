import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class calcolaMax {

    public static ArrayList<Integer> array = new ArrayList<>();

    public static void riempiLista(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero(termina con -1): ");
        Integer num = input.nextInt();
        while(num != -1){
            array.add(num);
            System.out.println("Inserisci un numero(termina con -1): ");
            num = input.nextInt();
        }
    }

    public static String trovaMax(){
        return "Il numero maggiore nell'array e': " + Collections.max(array);
    }

}
