// Creare un software che calcoli il BMI di una persona dato : altezza ( piedi ) , peso ( libre )
// BMI = peso in kg / (statura in metri * statura in metri)

// E stampi in output la corrispettiva costituzione in base alla tabella :
//Sottopeso severo  < 16,5
//Sottopeso da 16,5 a 18,4
//Normale   da 18,5 a 24,9
//Sovrappeso    da 25 a 30
//Obesità primo grado   da 30,1 a 34,9
//Obesità secondo grado da 35 a 40
//gskianto  > 40

// Dopo aver mostrato a schermo il risulato , verra` chiesto all'utente se vuole effettuare una misurazione
// piu` precisa. Se la risposta e` affermativa,
// viene chiesto un parametro aggiuntivo : circonferenza polso ( cm ) e il sesso . 

//Venga stampata la rispettiva costituzione seguendo la seguente tabella :
// Donna    Costituzione    Uomo
// < 15     Esile           < 17
// 15-16    Normale         17-18
// > 16     Robusta         > 18

//Input : 5.4 170
//Output: Sovrappeso
//Output: Vuoi effettuare una misurazione precisa ?
//Input: si
//Output : Inserisci la circonferenza del polso e il tuo sesso
//Input: 17 M
//Output: La tua costituzione e` : NORMALE
//Input : 5.4 170
//Output: Sovrappeso
//Output: Vuoi effettuare una misurazione precisa ?
//Input: No
//Output : Arrivederci


function calcoloBmi(bmi:number):void{

    if(bmi<16.5){
        console.log("Sottopeso severo");
    }
    else if(bmi >= 16.5 && bmi <18.4){
        console.log("Sottopeso");
    }
    else if(bmi >= 18.5 && bmi <24.9){
        console.log("Normale");
    }
    else if(bmi >= 25 && bmi <30){
        console.log("Sovrappeso");
    }
    else if(bmi >= 30.1 && bmi <34.9){
        console.log("Obestiá di primo grado");
    }
    else if(bmi >= 35 && bmi <40){
        console.log("Obestiá di secondo grado");
    }
    else if(bmi >= 40){
        console.log("Gskianto");
    }

}

function calcoloPolso():void{
    let conferma = String(prompt("Vuoi effettuare una misurazione precisa?"));

    if(conferma.toLowerCase() == "si"){
        let sesso = String(prompt("Inserisci sesso"));
        let polso = Number(prompt("Inserisci circonferenza polso in cm"));

        if(sesso.toLowerCase()=="donna"){
            if(polso<15){
                console.log("La tua costituzione é: esile");
            }
            else if(polso>=15 && polso<16){ 
                console.log("La tua costituzione é: Normale");
            }
            else if(polso>=16){ 
                console.log("La tua costituzione é: Robusta");
            }

        }
        else if(sesso.toLowerCase()== "uomo"){
            if(polso<17){
                console.log("La tua costituzione é: esile");
            }
            else if(polso>=17 && polso<18){ 
                console.log("La tua costituzione é: Normale");
            }
            else if(polso>=18){ 
                console.log("La tua costituzione é: Robusta");
            }
        }

    }
    else if(conferma.toLocaleLowerCase() == "no"){
        console.log("Arrivederci");
    }
}

let peso = Number(prompt("Inserisci peso in libbre"));
let altezza = Number(prompt("Inserisci altezza in piedi"));

altezza = altezza / 3.2808;
peso = peso /  2.2046;

let bmi:number = peso/(altezza * altezza);

calcoloBmi(bmi);
calcoloPolso();