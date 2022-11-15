package com.pizzaservice.restresource;

import java.util.Set;

public class CustomPizzaResource
{
  private long pizzaBaseId;

  private Set<Long> pizzaToppingIds;

  public CustomPizzaResource(long pizzaBaseId, Set<Long> pizzaToppingIds)
  {
    this.pizzaBaseId = pizzaBaseId;
    this.pizzaToppingIds = pizzaToppingIds;
  }

  public long getPizzaBaseId()
  {
    return pizzaBaseId;
  }

  public void setPizzaBaseId(long pizzaBaseId)
  {
    this.pizzaBaseId = pizzaBaseId;
  }

  public Set<Long> getPizzaToppingIds()
  {
    return pizzaToppingIds;
  }

  public void setPizzaToppingIds(Set<Long> pizzaToppingIds)
  {
    this.pizzaToppingIds = pizzaToppingIds;
  }
}
