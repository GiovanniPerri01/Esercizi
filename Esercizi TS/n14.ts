let n = Number(prompt("Inserisci un numero(termina con -1)"));
let list:number [] = [];
let v:boolean = true;
let numero:string = "";

while(n!=-1){
    list.push(n);
    n = Number(prompt("Inserisci un numero(termina con -1)"));
}

for(let i = 0; i < list.length; i++){
    if(list[i] >= 0 && list[i] <= 9){
        numero += list[i];
    }
    else{
        v = false;
        break;
    }
}

if(v){
    if(numero == ""){
        console.log("VUOTO")
    }
    else if(Number(numero)%3 == 0){
        console.log("SI");
    }
    else{
        console.log("NO");
    }
}
else{
    console.log("ERRORE");
}