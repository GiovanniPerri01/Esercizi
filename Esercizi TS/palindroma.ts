// Verificare se una parola e` palindroma .
// Una parola si dice palindroma se letta al contrario ha lo stesso valore
// es. otto anna ossesso
// Creare un programma che letta in input una parola,
// restituisca true se la parola e` palindroma
// falso se non lo e`.

let str = String(prompt());
let v:boolean = true;
let lunghezza = str.length-1;

for(let i = 0; i < lunghezza+1/2; i++){
    if(str[i] != str[lunghezza-i]){
        v = false;
        break;
    }
}

console.log(v);