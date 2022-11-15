package com.pizzaservice.mapper;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.CustomPizza;
import com.pizzaservice.model.PizzaBase;
import com.pizzaservice.model.PizzaTopping;
import com.pizzaservice.model.ReadyMadePizza;
import com.pizzaservice.repository.PizzaBaseRepository;
import com.pizzaservice.repository.PizzaToppingRepository;
import com.pizzaservice.restresource.CustomPizzaResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class CustomPizzaResourceMapper implements ResourceMapper<CustomPizzaResource, CustomPizza>
{
  @Autowired
  private PizzaBaseRepository pizzaBaseRepository;
  @Autowired
  private PizzaToppingRepository pizzaToppingRepository;

  @Override
  public CustomPizza mapRestToModel(CustomPizzaResource restResource)
  {
    CustomPizza customPizza = new CustomPizza();

    long pizzaBaseId = restResource.getPizzaBaseId();
    PizzaBase pizzaBase = pizzaBaseRepository.findById(pizzaBaseId)
      .orElseThrow(() -> getResourceNotFoundException(pizzaBaseId));

    customPizza.setPizzaBase(pizzaBase);

    Set<PizzaTopping> pizzaToppings = new HashSet<>();

    for (Long toppingId : restResource.getPizzaToppingIds())
    {
      PizzaTopping pizzaTopping = pizzaToppingRepository.findById(toppingId)
        .orElseThrow(() -> getResourceNotFoundException(toppingId));
      pizzaToppings.add(pizzaTopping);
    }

    customPizza.setPizzaToppings(pizzaToppings);

    return customPizza;
  }

  @Override
  public CustomPizzaResource mapModelToRest(CustomPizza modelData)
  {
    return null;
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("Resource not exist with id : " + id);
  }
}
