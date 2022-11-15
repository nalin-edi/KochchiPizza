package com.pizzaservice.mapper;

import com.pizzaservice.model.CustomPizzaOrder;
import com.pizzaservice.restresource.CustomPizzaOrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomPizzaOrderResourceMapper implements ResourceMapper<CustomPizzaOrderResource, CustomPizzaOrder>
{
  @Autowired
  private SizeMapper sizeMapper;

  @Autowired
  private CustomPizzaResourceMapper customPizzaResourceMapper;

  @Override
  public CustomPizzaOrder mapRestToModel(CustomPizzaOrderResource restResource)
  {
    CustomPizzaOrder customPizzaOrder = new CustomPizzaOrder();
    customPizzaOrder.setQuantity(restResource.getQuantity());
    customPizzaOrder.setSize(sizeMapper.mapRestToModel(restResource.getSize()));
    customPizzaOrder.setCustomPizza(customPizzaResourceMapper.mapRestToModel(restResource.getCustomPizza()));
    return customPizzaOrder;
  }

  @Override
  public CustomPizzaOrderResource mapModelToRest(CustomPizzaOrder modelData)
  {
    return null;
  }
}
