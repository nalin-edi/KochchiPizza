package com.pizzaservice.mapper;

import com.pizzaservice.model.CustomPizzaOrder;
import com.pizzaservice.model.PizzaOrder;
import com.pizzaservice.model.ReadyMadePizzaOrder;
import com.pizzaservice.restresource.CustomPizzaOrderResource;
import com.pizzaservice.restresource.PizzaOrderResource;
import com.pizzaservice.restresource.ReadyMadePizzaOrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class PizzaOrderResourceMapper implements ResourceMapper<PizzaOrderResource, PizzaOrder>
{
  @Autowired
  private SizeMapper sizeMapper;
  @Autowired
  private ReadyMadePizzaOrderResourceMapper readyMadePizzaOrderResourceMapper;
  @Autowired
  private CustomPizzaOrderResourceMapper customPizzaOrderResourceMapper;

  @Override
  public PizzaOrder mapRestToModel(PizzaOrderResource restResource)
  {
    PizzaOrder pizzaOrder = new PizzaOrder();
    pizzaOrder.setCustomerName(restResource.getCustomerName());
    pizzaOrder.setContactNumber(restResource.getContactNumber());
    pizzaOrder.setDeliveryAddress(restResource.getDeliveryAddress());
    pizzaOrder.setOrderState(restResource.getOrderState());
    pizzaOrder.setDeliveryType(restResource.getDeliveryType());

    Set<ReadyMadePizzaOrderResource> readyMadePizzaOrders = restResource.getReadyMadePizzaOrders();

    if (!readyMadePizzaOrders.isEmpty())
    {
      Set<ReadyMadePizzaOrder> pizzaOrders = new HashSet<>();
      for (ReadyMadePizzaOrderResource pizzaOrderResource : readyMadePizzaOrders)
      {
        ReadyMadePizzaOrder order = readyMadePizzaOrderResourceMapper.mapRestToModel(pizzaOrderResource);
        pizzaOrders.add(order);
      }
      pizzaOrder.setReadyMadePizzaOrders(pizzaOrders);
    }

    Set<CustomPizzaOrderResource> customPizzaOrders = restResource.getCustomPizzaOrders();

    if (!customPizzaOrders.isEmpty())
    {
      Set<CustomPizzaOrder> pizzaOrders = new HashSet<>();
      for (CustomPizzaOrderResource pizzaOrderResource : customPizzaOrders)
      {
        CustomPizzaOrder order = customPizzaOrderResourceMapper.mapRestToModel(pizzaOrderResource);
        pizzaOrders.add(order);
      }
      pizzaOrder.setCustomPizzaOrders(pizzaOrders);
    }

    return pizzaOrder;
  }

  @Override
  public PizzaOrderResource mapModelToRest(PizzaOrder modelData)
  {
    return null;
  }
}
