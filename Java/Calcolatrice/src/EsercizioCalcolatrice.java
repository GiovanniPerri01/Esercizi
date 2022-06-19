import java.util.Scanner;

public class EsercizioCalcolatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calcolatrice calcolatrice = new Calcolatrice();

        calcolatrice.n1 = input.nextInt();
        calcolatrice.n2 = input.nextInt();

        System.out.println(calcolatrice.somma());
        System.out.println(calcolatrice.sott());
        System.out.println(calcolatrice.molt());
        System.out.println(calcolatrice.div());

    }
}
