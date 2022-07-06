// Scrivere un programma che:
// prende in input una parola a  
// prende in input una parola b
// Output:
// concatenazione di a con b
// concatenazione di b con a

function conca():void{
        const a = String(prompt("Inserisci prima parola:"));
    const b = String(prompt("Inserisci seconda parola:"));

    console.log(a+b);
    console.log(b+a);
}

conca();