import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ReadymadePizza } from '../model/readymade-pizza';

@Injectable({
  providedIn: 'root'
})
export class ReadymadePizzaService {

  private baseURL = "http://localhost:8080/api/v1/ready-made-pizza";
  private createURL = this.baseURL + "/create";

  constructor(private httClient : HttpClient) { }

  getReadymadePizzaList(): Observable<ReadymadePizza[]>{
    return this.httClient.get<ReadymadePizza[]>(`${this.baseURL}`);
  }

  createReadymadePizza(readymadePizza:ReadymadePizza):Observable<Object> {
    return this.httClient.post(`${this.createURL}`, readymadePizza);
  }
}
