import { PizzaSize } from "src/app/pizza/model/pizza-size";
import { CustomePizza } from "./custome-pizza";

export class CustomePizzaOrder {
    id!: number;
    size!: PizzaSize;
    quentity!: number;
    pizza!: CustomePizza;
}
