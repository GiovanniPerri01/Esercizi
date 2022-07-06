let list:number [] = [];

for(let i = 0; i<10;i++){
    let seq = Number(prompt("Inserisci numero"));
    list.push(seq);
}

let x = Number(prompt("Inserisci x"));
let v:boolean = false;

for(let i = 0; i < list.length; i++){
    if(list[i]%x == 0){
        v = true;
        break
    }
}

if(!v){
    console.log("OK");
}
else{
    console.log("NO");
}