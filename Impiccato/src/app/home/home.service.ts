import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  constructor(private http:HttpClient) { }

  fetchWord(){
    return this.http.get<any>("https://random-word-api.herokuapp.com/word");
  }
  
}
