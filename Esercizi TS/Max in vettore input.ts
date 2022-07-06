//Scrivere un programma che calcoli il massimo in un vettore di dimensione 10 (valori presi da input)
//E.S 
// Input A = [ 1 9 200 9 1 9 0 50 20 175]
// Output : 200


let lista:Number[];

lista=[];

for(let i:number = 0; i<10; i++){
    lista[i] = Number(prompt("Inserisci numero"));

}

let max:Number = lista[0];

for(let i:number=0; i<lista.length; i++){
    if(lista[i]>max){

        max=lista[i];

    }
}

console.log(max)