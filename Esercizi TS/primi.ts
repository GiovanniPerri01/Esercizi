// DIFFICILE //
// Scrivere un programma restituisca i primi 30 numeri primi.
// Un numero si dice primo se e` divisibile SOLO e soltanto per se stesso e per 1  

let numero:number = 2;      
let p:number = 0;
let list:number[] = []

while (p < 30){
    let notPrime:boolean = false
    if(numero == 2){ 
        list.push(numero);
        p++;
    }
    else{
        for(let k = 2; k < numero; k++){
            if (numero % k == 0){
                notPrime = true;
                break;
            }
        }
        if (notPrime == false){ 
            list.push(numero);
            p++;
        }
    }
    numero++
} 

console.log(list);