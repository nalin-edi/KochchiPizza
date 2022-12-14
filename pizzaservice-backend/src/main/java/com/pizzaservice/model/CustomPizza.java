package com.pizzaservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "CustomPizza")
public class CustomPizza
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  @JoinColumn(name = "pizza_base_id")
  private PizzaBase pizzaBase;

  @ManyToMany
  private Set<PizzaTopping> pizzaToppings;

  public CustomPizza()
  {
  }

  public CustomPizza(PizzaBase pizzaBase, Set<PizzaTopping> pizzaToppings)
  {
    this.pizzaBase = pizzaBase;
    this.pizzaToppings = pizzaToppings;
  }

  public PizzaBase getPizzaBase()
  {
    return pizzaBase;
  }

  public void setPizzaBase(PizzaBase pizzaBase)
  {
    this.pizzaBase = pizzaBase;
  }

  public Set<PizzaTopping> getPizzaToppings()
  {
    return pizzaToppings;
  }

  public void setPizzaToppings(Set<PizzaTopping> pizzaToppings)
  {
    this.pizzaToppings = pizzaToppings;
  }
}
