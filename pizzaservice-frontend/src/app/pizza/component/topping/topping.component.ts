import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PizzaTopping } from '../../model/pizza-topping';
import { PizzaToppingService } from '../../service/pizza-topping.service';

@Component({
  selector: 'app-topping',
  templateUrl: './topping.component.html',
  styleUrls: ['./topping.component.css']
})
export class ToppingComponent {
  topping : PizzaTopping = new PizzaTopping();


  constructor(private  pizzaToppingService: PizzaToppingService, private router: Router){}

  ngOnInit(): void {
  }

  onSubmit()
  {
    console.log(this.topping);
    this.savePizzaTopping();
       

  }

  savePizzaTopping()
  {
    this.pizzaToppingService.createPizzaTopping(this.topping).subscribe(data => {console.log(data)}, error => console.log(error));
  }

}
