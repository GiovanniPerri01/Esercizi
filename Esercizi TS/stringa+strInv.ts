// Prese in input due parole
// Creare una terza parola, composta dalla prima e dall'inverso della seconda.
// input  : ciao
// input  : pizza
// output : ciaoazzip

let str1 = String(prompt());
let str2 = String(prompt());
let strInv:string = "";

for(let i = str2.length-1; i >=0; i--){
    strInv += str2[i];
}

console.log(str1 + strInv);
