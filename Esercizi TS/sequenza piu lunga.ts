/*
Prendere in input una sequenza di numeri terminata da -1 e stampare a schermo la lunghezza della sequenza ripetuta piu` lunga.
Una sequenza e` la successione di numeri uguali e consecutiva senza interruzioni di almeno lunghezza 2
Se esistono piu` sequenze con lo stesso valore, stampare la prima di esse
Es.
Input: 0 1 3 4 5 5 5 8 4 3 2 1 1 1 0 9 3 2 1 9 9 9 9 9 -1
Output : 9 con lunghezza 5
Input: 0 1 3 4 5 8 4 3 2 1 0 9 3 2 1 9 -1
Output : Non esiste una sequenza valida
Input: 0 1 3 4 5 5 5 5 5 8 4 3 2 1 1 1 0 9 3 2 1 9 9 9 9 9 -1
Output : 5 con lunghezza 5
 */

let n = Number(prompt("Inserisci numero e termina la sequenza con -1"));
let list:number [] = [];

while(n!=-1){
    list.push(n);
    n = Number(prompt("Inserisci numero e termina la sequenza con -1"));
}

let cont:number = 1;
let vecchioN:number = list[0]-1;
let vecchioC:number = 1;
let listc:number [] = [];
let listn:number [] = [];

for(let i:number = 0; i<list.length+1; i++){
    if(list[i]==list[i-1]){
        cont++;
        vecchioN = list[i]
    }
    else{
        if(cont>vecchioC){
            listc[0] = cont;
            listn[0] = vecchioN;
            vecchioC = cont;
        }
        cont = 1;
    }
}

if(list.length<1){
    console.log("Nessun numero inserito");
}
else{
    if(vecchioC>=2 || cont>=2){
        if(listc[0]>=vecchioC){
            console.log(listn[0] + " con lunghezza " + listc[0]);
        }
        else{
            console.log(vecchioN + " con lunghezza " + vecchioC);
        }
    }
    else{
        console.log("Non esiste una sequenza valida");}

}