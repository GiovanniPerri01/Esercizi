// DIFFICILE //
// Scrivere un programma prenda una sequenza di numeri, terminata -1.
// Restituisca il numero con il piu` alto numero di occorrenze .

// Input : 2 3 4 2 3 1 0 1 4 4 4 0 9 19 5 -1
// Ouput : Il numero con piu` occorrenze e` 4 

let list:number[] = [];
let numero = Number(prompt("Inserisci numero(termina con -1)"));
let c:number;
let lastc:number=0;
let maxc:number;

while (numero !=-1){
    list.push(numero);
    numero = Number(prompt("Inserisci numero(termina con -1)"));
} 

maxc = list[0];

for(let i:number = 0; i<list.length-1; i++){
    c = 1;

    for(let j:number = i+1; j<list.length; j++){

        if(list[i]== list[j]){
            c++;
        }
}
    if(c>lastc){
        maxc=list[i];
        lastc=c;
    }
}

console.log(list);
console.log(maxc);