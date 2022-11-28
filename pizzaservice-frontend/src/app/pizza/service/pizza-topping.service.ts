import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PizzaTopping } from '../model/pizza-topping';

@Injectable({
  providedIn: 'root'
})
export class PizzaToppingService {

  private baseURL = "http://localhost:8080/api/v1/pizza-toppings";
  private createURL = this.baseURL + "/create";

  constructor(private httClient : HttpClient) { }

  getPizzaToppingList(): Observable<PizzaTopping[]>{
    return this.httClient.get<PizzaTopping[]>(`${this.baseURL}`);
  }

  createPizzaTopping(pizzaTopping:PizzaTopping):Observable<Object> {
    return this.httClient.post(`${this.createURL}`, pizzaTopping);
  }
}
