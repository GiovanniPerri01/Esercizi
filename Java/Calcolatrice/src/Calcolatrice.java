public class Calcolatrice {

    public Integer n1;
    public Integer n2;

    public Integer somma(){
        return n1 + n2;
    }

    public Integer sott(){
        return n1 - n2;
    }

    public Integer molt(){
        return n1 * n2;
    }

    public Integer div(){
        if(n1>n2){
            return n1 / n2;
        }
        else{
            return n2 / n1;
        }
    }
}
