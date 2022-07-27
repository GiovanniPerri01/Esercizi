import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { NumericValueAccessor } from '@ionic/angular';
import { wordsList } from 'random-words';
import { HomeService } from './home.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  parola:String = "";
  parolaNascosta:String ="";
  immagine:number;
  url:String;
  lettera:string;
  caratteri:string = "1234567890!@#$%^&*()-_=+~`.,<>:;'/|?{}[]";
  parolaSplittata:String[];
  parolaSplittata2:String[];
  tentativi:number = 5;
  perso:Boolean = false;
  lettereTrovate:number;
  lettereUsate:String = "";

  controlloTentativi(){
    if(this.tentativi == 5){
      this.url = "../../assets/Images/i.png";
    }
    else if(this.tentativi == 4){
      this.url = "../../assets/Images/i1.png";
    }
    else if(this.tentativi == 3){
      this.url = "../../assets/Images/i2.png";
    }
    else if(this.tentativi == 2){
      this.url = "../../assets/Images/i3.png";
    }
    else if(this.tentativi == 1){
      this.url = "../../assets/Images/i4.png";
    }
    else if(this.tentativi == 0){
      this.url = "../../assets/Images/i5.png";
    }
    else{
      this.url = "../../assets/Images/i6.png";
    }
  }

  checkChar(){
    this.controlloTentativi();
    let v:Boolean = false;
    this.parolaSplittata = this.parola.split("");

    if(this.tentativi>=0){
      if(this.lettera.length >=2){
        alert("Attenzione, hai immesso piu' di una lettera");
      }
      else if(this.caratteri.includes(this.lettera)){
        alert("Attenzione, hai immesso caratteri non validi");
      }
      else if(this.lettera == ""){
        alert("Attenzione, non hai immesso nulla");
      }
      if(this.lettereUsate.includes(this.lettera)){
        alert("Hai gia' usato questa lettera!")
      }
      else{
        for(let i:number = 0; i < this.parolaSplittata.length; i++){
          if(this.parolaSplittata[i].toLowerCase() == this.lettera.toLowerCase()){
            v = true;
            this.parolaNascosta = this.parolaNascosta.substring(0,i) + this.lettera + this.parolaNascosta.substring(i +1);
            this.lettereTrovate -=1;
          }
        }
        if(!v){
          this.tentativi -= 1;
        }
      }
    }
    
    if(!this.lettereUsate.includes(this.lettera)){
      this.lettereUsate += this.lettera + ", ";
    }
    
    this.controlloTentativi();

    if(this.tentativi < 0){
      alert("Sei morto! La parola era: " + this.parola);
    }
    
    if(!this.parolaNascosta.includes("*")){
      alert("Hai vinto!");
    }

    
  }

  constructor(private chiamata:HomeService) { 
    this.controlloTentativi();
  }

  ngOnInit(){
    this.chiamata.fetchWord().subscribe(resp =>{
      this.parola = resp.pop();
      console.log(this.parola);
      this.lettereTrovate = this.parola.length;
      for(let i:number = 0; i < this.parola.length; i++){
        this.parolaNascosta += "*";
      }
    })
    
  }

}
