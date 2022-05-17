let n = Number(prompt("Inserisci un numero"));

let nToString:string = n.toString();

let ninv:string = "";

for(let i = nToString.length-1 ; i >= 0; i--){
    ninv += nToString[i];
}

let ninv1 = Number(ninv);

console.log(n-ninv1);