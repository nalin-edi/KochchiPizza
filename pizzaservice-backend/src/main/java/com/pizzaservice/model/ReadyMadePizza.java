package com.pizzaservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "ReadyMadePizza")
public class ReadyMadePizza
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "type")
  private PizzaType type;

  @Column(name = "description")
  private String description;

  @Column(name = "unit_price")
  private float unitPrice;

  @Column(name = "image_path")
  private String imagePath;

  @OneToMany(mappedBy = "id")
  private Set<ReadyMadePizzaOrder> readyMadePizzaOrders;

  public ReadyMadePizza()
  {
  }

  public ReadyMadePizza(PizzaType type,
                        String description,
                        float unitPrice,
                        String imagePath,
                        Set<ReadyMadePizzaOrder> readyMadePizzaOrders)
  {
    this.type = type;
    this.description = description;
    this.unitPrice = unitPrice;
    this.imagePath = imagePath;
    this.readyMadePizzaOrders = readyMadePizzaOrders;
  }

  public PizzaType getType()
  {
    return type;
  }

  public void setType(PizzaType type)
  {
    this.type = type;
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

  public String getImagePath()
  {
    return imagePath;
  }

  public void setImagePath(String imagePath)
  {
    this.imagePath = imagePath;
  }

  public Set<ReadyMadePizzaOrder> getReadyMadePizzaOrders()
  {
    return readyMadePizzaOrders;
  }

  public void setReadyMadePizzaOrders(Set<ReadyMadePizzaOrder> readyMadePizzaOrders)
  {
    this.readyMadePizzaOrders = readyMadePizzaOrders;
  }
}
