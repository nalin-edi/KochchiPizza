package com.pizzaservice.mapper;

import com.pizzaservice.model.PizzaSize;
import com.pizzaservice.restresource.Size;
import org.springframework.stereotype.Component;

@Component
public class SizeMapper implements ResourceMapper<Size, PizzaSize>
{

  @Override
  public PizzaSize mapRestToModel(Size restResource)
  {
    switch (restResource)
    {
    case SMALL:
      return PizzaSize.SMALL;
    case MEDIUM:
      return PizzaSize.MEDIUM;
    case LARGE:
      return PizzaSize.LARGE;
    default:
      // do nothing
    }
    return null;
  }

  @Override
  public Size mapModelToRest(PizzaSize modelData)
  {
    return null;
  }
}
