package com.pizzaservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CustomPizza_Order")
public class CustomPizzaOrder
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @OneToOne
  @JoinColumn(name = "pizza_id")
  private CustomPizza pizza;

  @Column(name = "size")
  private PizzaSize size;

  @Column(name = "quantity")
  private int quantity;

  @ManyToOne
  @JoinColumn(name = "pizza_order_id")
  private PizzaOrder pizzaOrder;

  @OneToOne
  @JoinColumn(name = "custom_pizza_id")
  private CustomPizza customPizza;

  public CustomPizzaOrder()
  {
  }

  public CustomPizzaOrder(CustomPizza pizza,
                          PizzaSize size,
                          int quantity,
                          PizzaOrder pizzaOrder,
                          CustomPizza customPizza)
  {
    this.pizza = pizza;
    this.size = size;
    this.quantity = quantity;
    this.pizzaOrder = pizzaOrder;
    this.customPizza = customPizza;
  }

  public CustomPizza getPizza()
  {
    return pizza;
  }

  public void setPizza(CustomPizza pizza)
  {
    this.pizza = pizza;
  }

  public PizzaSize getSize()
  {
    return size;
  }

  public void setSize(PizzaSize size)
  {
    this.size = size;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }

  public void setPizzaOrder(PizzaOrder pizzaOrder)
  {
    this.pizzaOrder = pizzaOrder;
  }

  public PizzaOrder getPizzaOrder()
  {
    return pizzaOrder;
  }

  public CustomPizza getCustomPizza()
  {
    return customPizza;
  }

  public void setCustomPizza(CustomPizza customPizza)
  {
    this.customPizza = customPizza;
  }
}
