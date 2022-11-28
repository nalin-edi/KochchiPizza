import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PizzaSize } from 'src/app/pizza/model/pizza-size';
import { ReadymadePizza } from 'src/app/pizza/model/readymade-pizza';
import { ReadymadePizzaService } from 'src/app/pizza/service/readymade-pizza.service';
import { PizzaOrder } from '../../model/pizza-order';
import { PizzaOrderService } from '../../service/pizza-order.service';

@Component({
  selector: 'app-create-pizza-order',
  templateUrl: './create-pizza-order.component.html',
  styleUrls: ['./create-pizza-order.component.css']
})
export class CreatePizzaOrderComponent {

  pizzaOrder: PizzaOrder = new PizzaOrder;
  allReadyMadePizza !: ReadymadePizza[]
  selectedReadyMadePizza !: ReadymadePizza[]
  sizes !: String[];
  
  constructor(private  pizzaOrderService: PizzaOrderService, private readyMadePizzaService: ReadymadePizzaService, private router: Router){}

  ngOnInit(): void {
    this.readyMadePizzaService.getReadymadePizzaList().subscribe(data => this.allReadyMadePizza = data);
    this.sizes = Object.keys(PizzaSize).filter((item) => {
      return isNaN(Number(item));
  });
  }

  onSubmit()
  {
    console.log(this.pizzaOrder);
    this.saveOrder();
    

  }

  saveOrder()
  {
    this.pizzaOrderService.createOrder(this.pizzaOrder).subscribe(data => {console.log(data)}, error => console.log(error));
  }

}
