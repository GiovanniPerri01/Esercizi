// Creare un convertitore di misurazioni, deve permettere la conversione di una misurazione da un unita` di misura ad un altra.
// Il programma dovra` chiedere all'utente quale tipo di misurazione vorrebbe convertire.
// le unita` di misura supportate sono riportate in tabella:
// Gradi    (1)    | centigradi (C) | fahrenheit (F)  |
// Distanza (2)    | kilometri (KM) | miglia (MI)     |
// L'utente puo` specificare il tipo di misurazione che vuole convertire usando 1 per gradi e 2 per distanza e successivamente
// fornire i seguenti valori : 
//      il valore misurato
//      l'unita` di misura originale
// Il programma dovra` restituire in output la conversione corretta .

// Esempio :
// Output: "Che tipo di misurazione vuoi convertire ? "
// Input: 1 
// Output: "Inserisci i seguenti valori:"
// Input: "Misurazione originale" 32
// Input: "Unita` di misura originale" C
// Output: "Il valore convertito e`: 89,6 F"

// Esempio :
// Output: "Che tipo di misurazione vuoi convertire ? "
// Input: 2
// Output: "Inserisci i seguenti valori:"
// Input: "Misurazione originale" 100
// Input: "Unita` di misura originale" KM
// Output: "Il valore convertito e`: 62,13 MI"

function gradi():void{
    let temperatura = Number(prompt("Inserisci temperatura originale"));
   
    let tipo = String(prompt("Inserisci unitá di misura originale"));

    if(tipo.toLowerCase()=="c"){
        console.log("Il valore convertito é: " + (1.8*temperatura+32)+ " F");
    }
    else if(tipo.toLowerCase()=="f"){
        console.log("Il valore convertito é: " + ((temperatura - 32)/ 1.8)+ " C");
    }
}

function distanza():void{
    let distanza = Number(prompt("Inserisci distanza originale"));
   
    let tipo = String(prompt("Inserisci unitá di misura originale"));

    if(tipo.toLowerCase()=="km"){
        console.log("Il valore convertito é: " + (distanza * 0.62137)+ " MI");
    }
    else if(tipo.toLowerCase()=="mi"){
        console.log("Il valore convertito é: " + (distanza / 0.62137)+ " KM");
    }
}    

let misurazione = Number(prompt("Che tipo di misurazione vuoi convertire?"));

if(misurazione == 1){
    gradi();
}
else if(misurazione == 2){
    distanza();
}