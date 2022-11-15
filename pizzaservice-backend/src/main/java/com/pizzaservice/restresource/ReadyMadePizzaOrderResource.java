package com.pizzaservice.restresource;

public class ReadyMadePizzaOrderResource
{
  private long readyMadePizzaId;
  private int quantity;
  private Size size;

  public ReadyMadePizzaOrderResource(long readyMadePizzaId, int quantity, Size size)
  {
    this.readyMadePizzaId = readyMadePizzaId;
    this.quantity = quantity;
    this.size = size;
  }

  public long getReadyMadePizzaId()
  {
    return readyMadePizzaId;
  }

  public void setReadyMadePizzaId(long readyMadePizzaId)
  {
    this.readyMadePizzaId = readyMadePizzaId;
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
