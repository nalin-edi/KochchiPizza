import { Component, OnInit } from '@angular/core';
import { PizzaOrder } from '../../model/pizza-order';
import { PizzaOrderService } from '../../service/pizza-order.service';

@Component({
  selector: 'app-pizza-order-list',
  templateUrl: './pizza-order-list.component.html',
  styleUrls: ['./pizza-order-list.component.css']
})
export class PizzaOrderListComponent implements OnInit{

  pizzaOrders: PizzaOrder[] = [];

  constructor(private  pizzaOrderService: PizzaOrderService){}

  ngOnInit(): void {
    this.getOrders();
  }

  private getOrders(){
    this.pizzaOrderService.getOrderList().subscribe(data => {
      this.pizzaOrders = data;
      console.log(this.pizzaOrderService.getOrderList());
    });

  }

}
