import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stringa-composta',
  templateUrl: './stringa-composta.page.html',
  styleUrls: ['./stringa-composta.page.scss'],
})
export class StringaCompostaPage implements OnInit {
  str1: string;
  str2: string;
  str3: string;

  constructor() {}

  ngOnInit() {}

  calcola() {
    this.str3="";
    for (let i = 0; i < this.str1.length; i++) {
      this.str3 += this.str1[i];
      if (i < this.str2.length - 1) {
        this.str3 += this.str2[i + 1];
      }
      i++;
    }
  }
}
