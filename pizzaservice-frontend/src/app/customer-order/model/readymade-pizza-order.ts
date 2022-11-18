import { PizzaSize } from "src/app/pizza/model/pizza-size";
import { ReadymadePizza } from "src/app/pizza/model/readymade-pizza";

export class ReadymadePizzaOrder {
    id!: number;
    size!: PizzaSize;
    quentity!: number;
    pizza!: ReadymadePizza;

}
