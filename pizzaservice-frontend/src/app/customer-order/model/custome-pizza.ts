import { PizzaBase } from "src/app/pizza/model/pizza-base";
import { PizzaTopping } from "src/app/pizza/model/pizza-topping";

export class CustomePizza {
    id!: number;
    pizzaBase!: PizzaBase;
    pizzaToppings!: PizzaTopping[];
}
