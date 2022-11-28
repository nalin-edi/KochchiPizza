import { Component, Input, OnInit, Output } from '@angular/core';
import { PizzaSize } from 'src/app/pizza/model/pizza-size';
import { ReadymadePizza } from 'src/app/pizza/model/readymade-pizza';
import { PizzaCartItem } from '../../model/pizza-cart-item';
import { MessengerService } from '../../service/messenger.service';

@Component({
  selector: 'app-readymade-pizza-item',
  templateUrl: './readymade-pizza-item.component.html',
  styleUrls: ['./readymade-pizza-item.component.css']
})
export class ReadymadePizzaItemComponent implements OnInit{

  @Input() pizza!: ReadymadePizza 

  price !: number
  quentity !: number
  // sizes !: string[];
  selectedSize !: string

  constructor(private msgService: MessengerService){
    
  }
  ngOnInit(): void {
    // this.sizes = Object.keys(PizzaSize).filter(item => { return isNaN(Number(item))})
    this.price = this.pizza.unitPrice
  }

  

  handleAddToCart()
  {
    this.msgService.sendMsg(this.createCartItem())
  }

  private createCartItem() : PizzaCartItem
  {
    return new PizzaCartItem(this.pizza.description, this.selectedSize, this.quentity, this.price)
  }

  onProfitSelectionChange(val:string)
  {
    if (val === 'S')
    {
      this.selectedSize = "SMALL"
    }
    else if (val === 'M')
    {
      this.selectedSize = "MIDUM"
      this.price*=1.25
    }
    else if (val === 'L')
    {
      this.selectedSize = "LARGE"
      this.price*=1.5
    }
  }
}
