//Scrivere un programma che calcoli il massimo in un vettore di dimensione 10 ( valori scelti a piacimento)
//E.S 
// let A:number = [1,5,20,15,500,230];
// Output : 500

let lista:Number[] = [1,5,1000,15,500,750];
let max:Number = lista[0];

for(let i:number=0; i<lista.length; i++){
    if(lista[i]>max){

        max=lista[i];

    }
}

console.log(max)