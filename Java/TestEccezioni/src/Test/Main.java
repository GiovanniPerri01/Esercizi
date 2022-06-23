package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        GestioneEccezioni.valore = scanner.nextInt();

        try{
            System.out.println(5/GestioneEccezioni.valore);
        }
        catch (Exception e){
            System.out.println("Il numero inserito e' uguale o minore di 0");
        }
    }
}
