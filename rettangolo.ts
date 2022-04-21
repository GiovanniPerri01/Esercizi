// Scrivere un programma che:
// prende in input un numero a rappresentante la base di un rettangolo  
// prende in input un numero b rappresentante l'altezza di un rettangolo
// Output:
// calcolare e restituire l'area del rettangolo
// calcolare il perimetro del rettangolo

function area(a:number,b:number):void{
    console.log(a*b);
}

function perimetro(a:number,b:number):void{
    console.log(a*2+b*2)
}

const a = Number(prompt("Inserisci base:"));
const b = Number(prompt("Inserisci altezza:"));

area(a,b);
perimetro(a,b);