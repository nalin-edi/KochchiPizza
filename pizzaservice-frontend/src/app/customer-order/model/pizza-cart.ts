import { Injectable } from "@angular/core";
import { ReadymadePizza } from "src/app/pizza/model/readymade-pizza";
import { CustomePizza } from "./custome-pizza";

@Injectable({
    providedIn: 'root'
  })
export class PizzaCart {

    readyMadePizzaList!: ReadymadePizza[];
    customePizzaList!: CustomePizza[]

    addCustomePizza(pizza: CustomePizza)
    {
        this.customePizzaList.push(pizza);
    }

    addReadyMadePizza(pizza: ReadymadePizza)
    {
        this.readyMadePizzaList.push(pizza);
    }

    clearCart()
    {
        this.readyMadePizzaList = [];
        this.customePizzaList = [];
    }

    getCustpmPizza()
    {
        return this.customePizzaList;
    }

    getReadymadePizza()
    {
        return this.readyMadePizzaList;
    }
}


