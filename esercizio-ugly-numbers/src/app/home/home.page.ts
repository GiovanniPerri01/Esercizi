import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  n:number;

  dividi(i:number, j:number){
    while(i%j == 0){
        i = i / j;
    }
    return i;

  }

  ifUgly(i:number):number{
    i = this.dividi(i,2);
    i = this.dividi(i,3);
    i = this.dividi(i,5);

    return(i==1) ? 1 : 0;
  }
  
  calcolaNumero(){

    let list:number [] = [];
    let i:number = 1;

    while(list.length <this.n){ 
      if(i == 1){
        list.push(i);
        i++;
      }
      else{
        if(this.ifUgly(i)==1){
            list.push(i);
        }
        i++;
      }
  
    }

  alert("Il numero in posizione " + this.n + " tra i numeri 'cessi a pedali' é " + list[this.n-1]);

  }
    
  constructor() {}

}
