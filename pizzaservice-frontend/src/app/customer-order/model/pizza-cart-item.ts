
export class PizzaCartItem {

    name!: string
    size!: string
    quentity !: number
    price!: number

    constructor(name: string, size:string, quentity : number, price: number)
    {
        this.name = name
        this.size = size
        this.quentity = quentity
        this.price = price
    }
}
