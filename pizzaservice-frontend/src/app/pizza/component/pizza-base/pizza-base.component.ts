import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PizzaBase } from '../../model/pizza-base';
import { PizzaBaseService } from '../../service/pizza-base.service';

@Component({
  selector: 'app-pizza-base',
  templateUrl: './pizza-base.component.html',
  styleUrls: ['./pizza-base.component.css']
})
export class PizzaBaseComponent {
  pizzaBase : PizzaBase = new PizzaBase();


  constructor(private  pizzaBaseService: PizzaBaseService, private router: Router){}

  ngOnInit(): void {
  }

  onSubmit()
  {
    console.log(this.pizzaBase);
    this.savePizzaBase();
       

  }

  savePizzaBase()
  {
    this.pizzaBaseService.createPizzaBase(this.pizzaBase).subscribe(data => {console.log(data)}, error => console.log(error));
  }


}
