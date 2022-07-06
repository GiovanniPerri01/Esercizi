let x = Number(prompt("Inserisci x"));
let n = Number(prompt("Inserisci n"));

let str:string = "";
let list:number [] = [];


for(let i = 0; i < n; i++){
    let seq = Number(prompt("Inserisci numero"));
    list.push(seq);
}

for(let i = 0; i < list.length; i++){
    if(list[i]%2 == 0 && list[i] < n){
        str += list[i];
    }
}

if(x!=0){
    if(str != ""){
        console.log(str);
    }
}