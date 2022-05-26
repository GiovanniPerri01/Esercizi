import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-palindroma',
  templateUrl: './palindroma.page.html',
  styleUrls: ['./palindroma.page.scss'],
})
export class PalindromaPage implements OnInit {
  str:string;
  risultato:boolean;

  constructor() { }

  ngOnInit() {
  }

  calcola(){

    let v:boolean = true;
    let lunghezza = this.str.length-1;

    for(let i = 0; i < lunghezza+1/2; i++){
      if(this.str[i] != this.str[lunghezza-i]){
        v = false;
        break;
      }
    }
  this.risultato = v;

  }
}
