//Scrivere un programma che preso in input Il nome e cognome in maiuscolo li restituisca in minuscolo
// Cercare sul web come rendere una stringa "lowercase"
// La logica che trasforma il testo, deve essere impletementa dentro una funzione che si chiama : minuscolo
// Input : MARCO ANASTASIO
// Ouput : marco anastasio

function minuscolo(nome:string, cognome:string):string{
    return(nome.toLowerCase()+" "+cognome.toLowerCase());
}

let nome = String(prompt("Inserisci nome: "))
let cognome = String(prompt("Inserisci nome: "))

console.log(minuscolo(nome,cognome));