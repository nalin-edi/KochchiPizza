import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ReadymadePizza } from '../../model/readymade-pizza';
import { ReadymadePizzaService } from '../../service/readymade-pizza.service';

@Component({
  selector: 'app-readymade-pizza',
  templateUrl: './readymade-pizza.component.html',
  styleUrls: ['./readymade-pizza.component.css']
})
export class ReadymadePizzaComponent {

  pizza : ReadymadePizza = new ReadymadePizza();


  constructor(private  readymadePizzaService: ReadymadePizzaService, private router: Router){}

  ngOnInit(): void {
  }

  onSubmit()
  {
    console.log(this.pizza);
    this.saveReadymadePizza();
       

  }

  saveReadymadePizza()
  {
    this.readymadePizzaService.createReadymadePizza(this.pizza).subscribe(data => {console.log(data)}, error => console.log(error));
  }

}
