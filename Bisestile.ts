/*
Si scriva un programma che preso in input un anno, stampi a se questo e` bisestile o meno.
Un anno si dice bisestile SE e SOLO SE :
    E` divisibile per 400
    E` divisibile per 4 ma non per 100
Input : 1600
Output : "l'anno e` bisestile";
Input : 1601
Otuput: "L'anno non e` bisestile";
Input : 1696
Otuput: "L'anno e` bisestile";
*/

let n = Number(prompt("inserisci anno: "));
/*
if(n%400==0 || (n%4==0) && (n%100!=0)){
    console.log("L'anno e` bisestile");
}
else{
    console.log("L'anno non e` bisestile"); 
}
*/
switch(n%400==0 || (n%4==0) && (n%100!=0)){
    case true:console.log("L'anno e` bisestile");break;
    case false:console.log("L'anno non e` bisestile");break;
}