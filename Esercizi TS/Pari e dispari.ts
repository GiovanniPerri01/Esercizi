/*
Si scriva un programma che preso in input un valore numerico, verifichi se questo sia PARI (EVEN) o DISPARI (ODD)
a schermo :
Input: 2
Output:  "Il numero e` pari "
Input: 3
"Il numero e` dispari "
*/

let n = Number(prompt("inserisci numero: "));
/*
if(n%2==0){
    console.log("Il numero e` pari");
}
else{
    console.log("Il numero e` dispari");
}
*/

function pod(n:number):void{
    switch(n%2){
        case 0: console.log("Il numero é pari"); break;
        case 1: console.log("Il numero é dispari"); break;
    }
}

pod(n);