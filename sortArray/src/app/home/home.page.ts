import { Component, Input } from '@angular/core';
import { element } from 'protractor';
import { empty } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  
  numero:number;
  list:number [] = [];
  messaggio:string = "";

  sortCrescente(list:number []){
    let temp:number = list[0]-1;

    for(let i = 0; i < list.length; i++){
        for(let j = i+1; j < list.length; j++){
            if(list[i] >= list[j]){
                temp = list[i];
                list[i] = list[j]; 
                list[j] = temp;
            }
        }
    }
    return list;
  }

  sortDecrescente(list:number []){
    let temp:number = list[0]-1;

    for(let i = 0; i < list.length; i++){
        for(let j = i+1; j < list.length; j++){
            if(list[i] <= list[j]){
                temp = list[i];
                list[i] = list[j]; 
                list[j] = temp;
            }
        }
    }
    return list;
  }

  sort(){
    this.messaggio ="Array ordinato in modo crescente: " + this.sortCrescente(this.list)+ "\n" + 
    "Array ordinato in modo decrescente: " + this.sortDecrescente(this.list);
  }

  insNumero(){
    this.list.push(this.numero);
  }

  clearList(){
    this.list = [];
  }

  constructor() {}

}
