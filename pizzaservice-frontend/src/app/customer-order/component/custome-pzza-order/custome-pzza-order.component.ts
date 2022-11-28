import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { PizzaBase } from 'src/app/pizza/model/pizza-base';
import { PizzaSize } from 'src/app/pizza/model/pizza-size';
import { PizzaTopping } from 'src/app/pizza/model/pizza-topping';
import { PizzaBaseService } from 'src/app/pizza/service/pizza-base.service';
import { PizzaToppingService } from 'src/app/pizza/service/pizza-topping.service';
import { CustomePizza } from '../../model/custome-pizza';
import { PizzaCart } from '../../model/pizza-cart';

@Component({
  selector: 'app-custome-pzza-order',
  templateUrl: './custome-pzza-order.component.html',
  styleUrls: ['./custome-pzza-order.component.css']
})
export class CustomePzzaOrderComponent {

  pizzaBaseList !: PizzaBase[]
  pizzaToppings!: PizzaTopping[]
  pizzaSizes !: string[]
  quentity!: Number

  pizzaForm!: FormGroup

  constructor(private  pizzaBaseService: PizzaBaseService, private pizzaToppingService: PizzaToppingService, private pizzaCart: PizzaCart){}

  ngOnInit(): void {

    this.pizzaBaseService.getPizzaBaseList().subscribe(data=> this.pizzaBaseList=data)
    this.pizzaToppingService.getPizzaToppingList().subscribe(data=> this.pizzaToppings=data)

    this.pizzaSizes = Object.keys(PizzaSize).filter((item) => {
      return isNaN(Number(item));
  });

  this.pizzaForm = new FormGroup({
    base: new FormControl(),
    topping: new FormControl(),
    size: new FormControl(),
    quentity: new FormControl(),
  });

  }

  onSubmit() : void {
    this.pizzaCart.addCustomePizza(this.pizzaForm.value);
    console.log(this.pizzaForm.value);

  }

}
