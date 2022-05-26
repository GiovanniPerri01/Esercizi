import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stringhe-concatenate',
  templateUrl: './stringhe-concatenate.page.html',
  styleUrls: ['./stringhe-concatenate.page.scss'],
})
export class StringheConcatenatePage implements OnInit {
  str1:string;
  str2:string;
  str3:string;

  constructor() { }

  ngOnInit() {
  }

  calcola(){
    this.str3 = this.str1;
    for(let i = this.str2.length-1; i >=0; i--){
      this.str3 += this.str2[i];
    }
    
  }
}
