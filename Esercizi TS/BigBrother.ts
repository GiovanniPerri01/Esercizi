function controllaValidita(codice:string):boolean{
    let a:number = 0;
    let b:number = 0;
    let c:number = 0;

    for(let i = 0; i<codice.length;i++){
        if(codice[i].toLowerCase() == "a"){
            a++;
        }
        if(codice[i].toLowerCase() == "b"){
            b++;
        }
        if(codice[i].toLowerCase() == "c"){
            c++;
        }
    }

    if(a == 3 && b == 2 && c == 1){
        return true;
    }
    else{
        return false;
    }

}

function trovaSuccessore(codice:string){
    return "Successore";
}

function main(){
    let codice = String(prompt("Inserisci un codice"));
    let listaCodici:string [] = [];

    while(codice !="#"){
        listaCodici.push(codice);
        codice = String(prompt("Inserisci un codice"));
    }
    
    for(let i = 0; i<listaCodici.length; i++){
        if(controllaValidita(listaCodici[i])){
            console.log(trovaSuccessore(listaCodici[i]))
        }
        else{
            console.log("Nessun successore");        
        }
    }

    console.log(listaCodici);
    
}

main()