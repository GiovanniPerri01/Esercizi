import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-n7b',
  templateUrl: './n7b.page.html',
  styleUrls: ['./n7b.page.scss'],
})
export class N7bPage implements OnInit {

  x:number;
  n:number;
  numero:number;
  list:number [] = [];
  str:string = "";

  constructor() { }

  ngOnInit() {
  }

  calcola(){

    for(let i = 0; i < this.list.length; i++){
        if(this.list[i]%2 == 0 && this.list[i] < this.n){
            this.str += this.list[i];
        }
    }

    if(this.x!=0){
        if(this.str != ""){
          console.log(this.str);
        }
    }
  }

  insNum(){
    this.list.push(this.numero);
  }

  clearList(){
    this.list = [];
    this.str = "";
  }
}
