import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-n10',
  templateUrl: './n10.page.html',
  styleUrls: ['./n10.page.scss'],
})
export class N10Page implements OnInit {
  
  numero:number;
  risultato:number;

  constructor() { }

  ngOnInit() {
  }

  calcola(){ 
    let ninv:string = "";

    for(let i = String(this.numero).length-1 ; i >= 0; i--){
      ninv += String(this.numero)[i];
    }

    this.risultato = this.numero - Number(ninv);
  }

}
