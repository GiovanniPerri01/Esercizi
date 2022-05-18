import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-n14',
  templateUrl: './n14.page.html',
  styleUrls: ['./n14.page.scss'],
})
export class N14Page implements OnInit {
  numero:number;
  list:number [] = [];
  num:string = "";
  str:string;

  constructor() { }

  ngOnInit() {
  }

  insNum(){
    this.list.push(this.numero);
  }

  calcola(){
    this.str = "";
    this.num = "";
    let v:boolean = true;
    for(let i = 0; i < this.list.length; i++){
      if(this.list[i] >= 0 && this.list[i] <= 9){
          this.num += this.list[i];
      }
      else{
          v = false;
          break;
      }
    }
  
    if(v){
      if(this.num == ""){
        this.str = "VUOTO";
      }
      else if(Number(this.num)%3 == 0){
        this.str = "SI";
      }
      else{
        this.str = "NO";
      }
    }
    else{
      this.str = "ERRORE";;
    }
  }

  clearList(){
    this.list = [];
  }

}
