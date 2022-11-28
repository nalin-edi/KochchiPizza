import { Component, Input, OnInit } from '@angular/core';
import { PizzaCartItem } from '../../model/pizza-cart-item';
import { MessengerService } from '../../service/messenger.service';

@Component({
  selector: 'app-pizza-cart',
  templateUrl: './pizza-cart.component.html',
  styleUrls: ['./pizza-cart.component.css']
})
export class PizzaCartComponent implements OnInit{


  cartItems!: PizzaCartItem[]
  totalPrice = 0

  constructor(private msgService: MessengerService)
  {

  }

  ngOnInit(): void {

    // this.msgService.getMsg().subscribe((item) => 
    // this.cartItems.push(item));

    this.cartItems.forEach(item=>{
      this.totalPrice += (item.price * item.quentity)
    })



  

    // this.msgService.getMsg().subscribe((pizza: ReadymadePizza)  => 
    // {

    //   this.item  = new PizzaCartItem(pizza.description, pizza.quentity, pizza.unitPrice);
    
    //   //this.cartItems.push(new PizzaCartItem(pizza.description, pizza.quentity, pizza.unitPrice))
    
    // })


    //this.readyMadePizzaService.getReadymadePizzaList().subscribe(data => data.forEach(d=> this.allReadyMadePizza.push(new ReadymadePizza(d.type, d.unitPrice, d.description, d.imagePath))));
     
  }

}
