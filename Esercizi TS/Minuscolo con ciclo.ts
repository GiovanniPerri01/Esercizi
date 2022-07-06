//Scrivere un programma che prenda in input una sequenza di numeri, e quando l'utente inserisce -1 termini
//restituendo il valore piu` piccolo inserito
//E.S 
// Input : 1 9 19 9 1 9 0 -1
// Output : 0

let a=Number(prompt("Inserisci numero(termina con -1)"));

let min:Number=a+1;

while(a!=-1){
    if(a<min && a!=-1){
        min = a;
    }
    a = Number(prompt("Inserisci numero(termina con -1)"))
}
console.log(min);