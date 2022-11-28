import { Component, OnInit } from '@angular/core';
import { ReadymadePizza } from 'src/app/pizza/model/readymade-pizza';
import { ReadymadePizzaService } from 'src/app/pizza/service/readymade-pizza.service';

@Component({
  selector: 'app-readymade-pizza-list',
  templateUrl: './readymade-pizza-list.component.html',
  styleUrls: ['./readymade-pizza-list.component.css']
})

export class ReadymadePizzaListComponent{

  allReadyMadePizza !: ReadymadePizza[]

  constructor(private readyMadePizzaService: ReadymadePizzaService)
  {
    this.readyMadePizzaService.getReadymadePizzaList().subscribe(data => this.allReadyMadePizza = data);
  }
}

