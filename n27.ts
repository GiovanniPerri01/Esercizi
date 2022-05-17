let n = Number(prompt("Inserisci n"));
let seq = Number(prompt("Inserisci numero"));
let list:number [] = [];
let cont:number = 1;
let v:boolean = false;

while(seq != -1){
    list.push(seq);
    seq = Number(prompt("Inserisci numero"));
}

for(let i = 0; i < list.length; i++){
    if(cont == n){
        v = true;
        break;
    }
    if(list[i] <= n && list[i+1] <= n){
        cont++;
    }
    else{
        cont = 1;
    }

}

if(v){
    console.log("OK");
}
else{
    console.log("NO");
}