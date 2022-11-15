package com.pizzaservice.restresource;

public class CustomPizzaOrderResource
{
  private CustomPizzaResource customPizza;
  private int quantity;
  private Size size;

  public CustomPizzaOrderResource(CustomPizzaResource customPizza, int quantity, Size size)
  {
    this.customPizza = customPizza;
    this.quantity = quantity;
    this.size = size;
  }

  public CustomPizzaResource getCustomPizza()
  {
    return customPizza;
  }

  public void setCustomPizza(CustomPizzaResource customPizza)
  {
    this.customPizza = customPizza;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }

  public Size getSize()
  {
    return size;
  }

  public void setSize(Size size)
  {
    this.size = size;
  }
}
