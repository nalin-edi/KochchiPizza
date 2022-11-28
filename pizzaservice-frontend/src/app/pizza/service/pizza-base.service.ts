import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PizzaBase } from '../model/pizza-base';

@Injectable({
  providedIn: 'root'
})
export class PizzaBaseService {

  private baseURL = "http://localhost:8080/api/v1/pizza-bases";
  private createURL = this.baseURL + "/create";

  constructor(private httClient : HttpClient) { }

  getPizzaBaseList(): Observable<PizzaBase[]>{
    return this.httClient.get<PizzaBase[]>(`${this.baseURL}`);
  }

  createPizzaBase(pizzaBase:PizzaBase):Observable<Object> {
    return this.httClient.post(`${this.createURL}`, pizzaBase);
  }
}
