let n = Number(prompt("Inserisci un numero(termina con 0)"));
let list:number [] = [];
let crescente:boolean = false;
let decrescente:boolean = false;
let sl:number = 0;

while(n != 0){
    list.push(n);
    n = Number(prompt("Inserisci un numero(termina con 0)"));
}

for(let i = 0; i < list.length-1; i++){
    if(list[i] < list[i+1]){
        crescente = true;
    }
    else{
        sl = i;
        break;
    }
}

if(crescente){
    for(sl; sl < list.length-1; sl++){
        if(list[sl] > list[sl+1]){
        decrescente = true;
        }
        else{
            decrescente = false;
            console.log("NO");
            break;
        }
    }
}
else {
    console.log("NO");
}

if(decrescente){
    console.log("SI");
}