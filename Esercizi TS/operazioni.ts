// Scrivere un programma che:
// prende in input un numero a  
// prende in input un numero b
// Output:
// somma di a con b
// sottrazione di a con b
// moltiplicazione di a con b 
// divisione di a con b

function operazioni(a:number,b:number):void{
        console.log(a+b);
    console.log(a-b);
    console.log(a*b);
    console.log(a/b);
}

const a = Number(prompt("Inserisci primo numero:"));
const b = Number(prompt("Inserisci secondo numero:"));

operazioni(a,b)