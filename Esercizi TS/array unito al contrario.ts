/*
Scrivere un programma che popoli due array A , B di dimensione N,M arbitraria ( min 5 , Max 10 ) i cui valori sono presi in input.
Successivamente creare un terzo array C di dimensione N+M dove nelle posizioni da 0 a N inserite i valori A e nelle posizioni da N+1
a M inserite i valori di B al contrario
Considerare 0 come pari
Input: 5
// popolare il vettore
A = [ 1, 3, 4,  5, 6];
B = [ 7, 8, 9, 10,11];
Output: C = [ 1, 3, 4 ,5, 6, 11,1 0, 9, 8, 7];
 */


let a:String [] = [];
let b:String [] = [];
let c:String [] = []; 

let n:number = 5;
let m:number = 5;

for(let i:number = 0;i<n;i++){
    a.push(String(prompt("Inserisci valore per array a")));
}

for(let i:number = 0;i<m;i++){
    b.push(String(prompt("Inserisci valore per array b")));
}

let v:number = 1;

for(let i:number = 0;i<n+m;i++){
    if(i<n){
        c.push(a[i]);
    }
    else if(i>=n){
        c.push(b[m-v]);
        v++;
    }
}

console.log(c);