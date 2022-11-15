package com.pizzaservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ReadyMadePizza_Order")
public class ReadyMadePizzaOrder
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "size")
  private PizzaSize size;

  @Column(name = "quantity")
  private int quantity;

  @ManyToOne
  @JoinColumn(name = "pizza_order_id")
  private PizzaOrder pizzaOrder;

  @ManyToOne
  @JoinColumn(name = "ready_made_pizza_id")
  private ReadyMadePizza readyMadePizza;

  public ReadyMadePizzaOrder()
  {
  }

  public ReadyMadePizzaOrder(PizzaSize size,
                             int quantity,
                             PizzaOrder pizzaOrder,
                             ReadyMadePizza readyMadePizza)
  {
    this.size = size;
    this.quantity = quantity;
    this.pizzaOrder = pizzaOrder;
    this.readyMadePizza = readyMadePizza;
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

  public PizzaOrder getPizzaOrder()
  {
    return pizzaOrder;
  }

  public void setPizzaOrder(PizzaOrder pizzaOrder)
  {
    this.pizzaOrder = pizzaOrder;
  }

  public ReadyMadePizza getReadyMadePizza()
  {
    return readyMadePizza;
  }

  public void setReadyMadePizza(ReadyMadePizza readyMadePizza)
  {
    this.readyMadePizza = readyMadePizza;
  }
}
