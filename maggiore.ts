/*
Si scriva un programma che presi in input 3 valori, verifichi e stampi a schermo quali tra questi e` il piu` grande
a schermo :
E.S
Input: 3 54 12
Output: Il valore piu` grande e` : 54	
*/

let n1 = Number(prompt("inserisci primo numero"));
let n2 = Number(prompt("inserisci secondo numerp: "));
let n3 = Number(prompt("inserisci terzo numero: "));
/*
if(n1>n2){
    if(n1>n3){
        console.log("Il valore piu` grande e` :" + n1);
    }
    else{
        console.log("Il valore piu` grande e` :" + n3);
    }
}
else{
    if(n2>n3){
        console.log("Il valore piu` grande e` :" + n2);
    }
    else{
        console.log("Il valore piu` grande e` :" + n3);
    }
}
*/

switch(n1>n2){
    case true: switch(n1>n3){
        case true: console.log("Il valore piu` grande e` :" + n1); break;
        case false: console.log("Il valore piu` grande e` :" + n3); break;
    }
    ;break
    case false: switch(n2>n3){
        case true: console.log("Il valore piu` grande e` :" + n2); break;
        case false: console.log("Il valore piu` grande e` :" + n3); break;
    }
    ;break
}