import { Component, Input } from '@angular/core';
import { PizzaCartItem } from '../../model/pizza-cart-item';

@Component({
  selector: 'app-pizza-cart-item',
  templateUrl: './pizza-cart-item.component.html',
  styleUrls: ['./pizza-cart-item.component.css']
})
export class PizzaCartItemComponent {

  @Input() cartItem! : PizzaCartItem

  constructor(){}

}
