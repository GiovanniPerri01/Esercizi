let a = Number(prompt("Inserisci un numero compreso tra 0 e 1.000.000"));
let b = Number(prompt("Inserisci un numero compreso tra 0 e 1.000.000"));

let cont:number;
let contV:number = 0;

let i:number;
let j:number;
let n:number;

if(a > 0 && a < 10000000 && b > 0 && b < 10000000){
    
    if(b > a){
        i = a;
        j = b;
    } 
    else{
        i = b;
        j = a;
    }

    for(i; i <= j; i++){
        n = i;
        cont = 1;

        while(n != 1)
        {
            if(n % 2 == 0)
            {
                n = n / 2 ;
                cont++;
            }
            else
            {
                n = 3 * n + 1;
                cont++;
            }
        }
        
        if(contV < cont){

            contV = cont;

        }
    }

    console.log(a,b,contV);

}