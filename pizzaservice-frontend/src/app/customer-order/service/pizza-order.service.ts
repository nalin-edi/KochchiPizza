import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PizzaOrder } from '../model/pizza-order';

@Injectable({
  providedIn: 'root'
})
export class PizzaOrderService {

  private baseURL = "http://localhost:8080/api/v1/pizza-order";
  private createURL = this.baseURL + "/create";

  constructor(private httClient : HttpClient) { }

  getOrderList(): Observable<PizzaOrder[]>{
    return this.httClient.get<PizzaOrder[]>(`${this.baseURL}`);
  }

  createOrder(pizzaOrder:PizzaOrder):Observable<Object> {
    return this.httClient.post(`${this.createURL}`, pizzaOrder);
  }
}
