import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-n32',
  templateUrl: './n32.page.html',
  styleUrls: ['./n32.page.scss'],
})
export class N32Page implements OnInit {
  numero:number;
  list:number [] = [];
  str:string;

  constructor() { }

  ngOnInit() {
  }

  insNum(){
    this.list.push(this.numero);
  }

  clearList(){
    this.list = [];
    this.str = "";
  }

  calcola(){
    let crescente:boolean = false;
    let decrescente:boolean = false;
    let sl:number = 0;

    for(let i = 0; i < this.list.length-1; i++){
      if(this.list[i] < this.list[i+1]){
        crescente = true;
      }
      else{
        sl = i;
        break;
      }
    }
  
    if(crescente){
      for(sl; sl < this.list.length-1; sl++){
        if(this.list[sl] > this.list[sl+1]){
          decrescente = true;
        }
        else{
          decrescente = false;
          this.str = "NO";
          break;
        }
      }
    }
    else {
      this.str = "NO";
    }
    
    if(decrescente){
      this.str = "SI";
    }
  }

}
