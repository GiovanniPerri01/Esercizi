class Rettangolo{
    base:number;
    altezza:number;

    constructor(base:number, altezza:number){
        this.base = base;
        this.altezza = altezza; 
    }

    CalcolaArea():number{
        return this.base * this.altezza;
    }

    CalcolaPerimetro():number{
        return (this.base + this.altezza) * 2;
    }

}

class Triangolo{
    base:number;
    altezza:number;

    constructor(base:number, altezza:number){
        this.base = base;
        this.altezza = altezza; 
    }

    CalcolaArea():number{
        return (this.base * this.altezza)/2;
    }

    CalcolaPerimetro():number{
        return 3 * this.base;
    }

}

class Quadrato{
    lato:number;

    constructor(lato:number){
        this.lato = lato;
    }

    CalcolaArea():number{
        return this.lato * 4;
    }

    CalcolaPerimetro():number{
        return this.lato * this.lato;
    }
}

class Cerchio{
    raggio:number;

    constructor(raggio:number){
        this.raggio = raggio;
    }

    CalcolaArea():number{
            return (this.raggio * this.raggio) * 3.14;
        }

    CalcolaPerimetro():number{
        return  (2 * 3.14) * this.raggio;
    }

}

function InputUtente():void{
    let tipo = String(prompt("Inserisci tipo figura"));
    let i1:number;
    let i2:number;

    if(tipo.toLowerCase() == "rettangolo"){
        i1 = +prompt("Inserisci base");
        i2 = +prompt("Inserisci altezza");
        let rett:Rettangolo = new Rettangolo(i1,i2);
        console.log("Area: " + rett.CalcolaArea());
        console.log("Perimetro: " + rett.CalcolaPerimetro());
    }
    else if(tipo.toLowerCase() == "triangolo"){
        i1 = +prompt("Inserisci base");
        i2 = +prompt("Inserisci altezza");
        let tri:Triangolo = new Triangolo(i1,i2);
        console.log("Area: " + tri.CalcolaArea());
        console.log("Perimetro: " + tri.CalcolaPerimetro());
        
    }
    else if(tipo.toLowerCase() == "quadrato"){
        i1 = +prompt("Inserisci lato");
        let quad:Quadrato = new Quadrato(i1);
        console.log("Area: " + quad.CalcolaArea());
        console.log("Perimetro: " + quad.CalcolaPerimetro());
        
    }
    else if(tipo.toLowerCase() == "cerchio"){
        i1 = +prompt("Inserisci raggio");
        let cer:Quadrato = new Quadrato(i1);
        console.log("Area: " + cer.CalcolaArea());
        console.log("Perimetro: " + cer.CalcolaPerimetro());
    }
}

InputUtente();