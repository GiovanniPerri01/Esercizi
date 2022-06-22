import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static ArrayList<Integer> array1 = new ArrayList<>();
    public static ArrayList<Integer> array2 = new ArrayList<>();
    public static ArrayList<Integer> array3 = new ArrayList<>();

    public static void riempiArrays(){

        Scanner input = new Scanner(System.in);

        //riempiamo il primo array
        System.out.println("Riempi il primo array");
        System.out.println("Inserisci un numero(termina con -1): ");
        Integer num = input.nextInt();
        while(num != -1){
            array1.add(num);
            System.out.println("Inserisci un numero(termina con -1): ");
            num = input.nextInt();
        }

        //riempiamo il secondo array
        System.out.println("Riempi il secondo array");
        System.out.println("Inserisci un numero(termina con -1): ");
        num = input.nextInt();
        while(num != -1){
            array2.add(num);
            System.out.println("Inserisci un numero(termina con -1): ");
            num = input.nextInt();
        }
    }

    public static ArrayList fusione(){

        for(int i = 0; i<array1.size(); i++){
            array3.add(array1.get(i));
        }
        for(int i = 0; i<array2.size(); i++){
            array3.add(array2.get(i));
        }

        return array3;
    }
}
