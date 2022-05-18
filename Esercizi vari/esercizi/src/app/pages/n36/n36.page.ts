import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-n36',
  templateUrl: './n36.page.html',
  styleUrls: ['./n36.page.scss'],
})
export class N36Page implements OnInit {
  x:number;
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
    let v:boolean = false;

    for(let i = 0; i < this.list.length; i++){
      if(this.list[i]%this.x == 0){
        v = true;
        break
      }
    }

    if(!v){
      this.str = "OK";
    }
    else{
      this.str = "NO";
    }
  }

}
