// Scrivere un programma che preso in input, la dimensione di un array N e i suoi valori, ordini l'array in ordine crescente / decrescente
// Input: [ 1 ,5 ,19 ,20 ,50 ,6]
// Ouput: [ 1 ,5 ,6 ,19 ,20 ,50]

function sortCrescente(list:number []){
    let temp:number = list[0]-1;

    for(let i = 0; i < list.length; i++){
        for(let j = i+1; j < list.length; j++){
            if(list[i] >= list[j]){
                temp = list[i];
                list[i] = list[j]; 
                list[j] = temp;
            }
        
        }

    }
    
    return list;

}

function sortDecrescente(list:number []){
    let temp:number = list[0]-1;

    for(let i = 0; i < list.length; i++){
        for(let j = i+1; j < list.length; j++){
            if(list[i] <= list[j]){
                temp = list[i];
                list[i] = list[j]; 
                list[j] = temp;
            }
        
        }

    }
    
    return list;

}

function main(){
    let list:number [] = [];

    let n = Number(prompt("Inserisci un valore, termina con -1"));

    while(n != -1){
    list.push(n);
    n = Number(prompt("Inserisci un valore, termina con -1"));
    }

    console.log("Lista ordinata in modo crescente: " + sortCrescente(list));
    console.log("Lista ordinata in modo decrescente: " + sortDecrescente(list));

    return 0;
}

main();