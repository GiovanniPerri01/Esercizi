/*
Si scriva un programma che preso in input un valore numerico, verifichi se questo sia POSITIVO o NEGATVO e stampi
a schermo :
Input: 2
Output: "Il numero e` positivo "
Input: -10
Output: "Il numero e` negativo "
*/

let n = Number(prompt("inserisci numero"));
/*
if(n<0){
    console.log("Il numero e` negativo");
}
else{
    console.log("Il numero e` positivo");
}
*/
switch(n<0){
    case true: console.log("Il numero e` negativo");break;
    case false: console.log("Il numero e` positivo");break;
}