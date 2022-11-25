import { CustomePizzaOrder } from "./custome-pizza-order";
import { ReadymadePizzaOrder } from "./readymade-pizza-order";

export class PizzaOrder {
    id!: number;
    customerName!: string;
    deliveryAddress!: string;
    contactNumber!: string;
    readyMadePizzaOrders!: ReadymadePizzaOrder[];
    customPizzaOrders!: CustomePizzaOrder[];
    orderState!: string;
    deliveryType!: string;

}

