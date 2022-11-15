package com.pizzaservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PizzaTopping")
public class PizzaTopping
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "description")
  private String description;

  @Column(name = "unit_price")
  private float unitPrice;

  public PizzaTopping()
  {
  }

  public PizzaTopping(String description, float unitPrice)
  {
    this.description = description;
    this.unitPrice = unitPrice;
  }

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public float getUnitPrice()
  {
    return unitPrice;
  }

  public void setUnitPrice(float unitPrice)
  {
    this.unitPrice = unitPrice;
  }

}
