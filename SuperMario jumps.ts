let altezze:number[] = [];

for(let i = 0; i < 10; i++){
    altezze.push(Number(prompt("Inserisci altezze muri")));
}

let alti:number = 0;

let bassi:number = 0;

for(let i = 0; i < 9; i++){
    
    if(altezze[i] > altezze[i+1]){
        bassi++;
    }
    else if(altezze[i] < altezze[i+1]){
        alti++;
    }

}

console.log(alti + " " + bassi);