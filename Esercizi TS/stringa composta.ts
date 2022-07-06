// Prese in input due parole
// Creare una terza parola, composta dalle lettere della prima e della seconda in maniera alternata.
// input  : ciaop
// input  : pizza
// output : ciazp

let str1 = String(prompt());
let str2 = String(prompt());
let strComp:string = "";

for(let i = 0; i<str1.length && i+1; i++){
    strComp += str1[i];
    if(i<str2.length-1){
        strComp += str2[i+1];
    }
    i++;
}

console.log(strComp);