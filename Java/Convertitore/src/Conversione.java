public class Conversione {

    public Double numero;
    public String conv;

    public void calcolo(){
        switch(this.conv){
            case "c":
                System.out.println("La temperatura convertita e': " + (1.8*numero+32));
                break;
            case "f":
                System.out.println("La temperatura convertita e': " + (numero-32)/1.8);
                break;
            case "k":
                System.out.println("La distanza convertita e': " + (numero*0.62137));
                break;
            case "m":
                System.out.println("La distanza convertita e': " + (numero/0.62137));
                break;
        }
    }
}
