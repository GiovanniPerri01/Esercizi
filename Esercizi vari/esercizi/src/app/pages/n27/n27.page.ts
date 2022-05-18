import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-n27',
  templateUrl: './n27.page.html',
  styleUrls: ['./n27.page.scss'],
})
export class N27Page implements OnInit {
  n:number;
  numero:number;
  list:number [] = [];
  str:string;

  constructor() { }

  ngOnInit() {
  }

  insNum(){
    this.list.push(this.numero);
  }

  calcola(){
    this.str = "";
    let cont:number = 1;
    let v:boolean = false;
    for(let i = 0; i < this.list.length; i++){
      if(cont == this.n){
        v = true;
        break;
      }
      if(this.list[i] <= this.n && this.list[i+1] <= this.n){
        cont++;
      }
      else{
        cont = 1;
      }
    }
  
    if(v){
      this.str = "OK";
    }
    else{
      this.str = "NO";
    }
  }

  clearList(){
    this.list = [];
    this.str = "";
  }
}
