import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { PizzaCartItem } from '../model/pizza-cart-item';

@Injectable({
  providedIn: 'root'
})
export class MessengerService {

  constructor() { }

  subject = new Subject()

  sendMsg(cartItem: PizzaCartItem)
  {
    this.subject.next(cartItem)

  }

  getMsg()
  {
    return this.subject.asObservable()

  }
}
