package com.pizzaservice.mapper;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.ReadyMadePizza;
import com.pizzaservice.model.ReadyMadePizzaOrder;
import com.pizzaservice.repository.ReadyMadePizzaRepository;
import com.pizzaservice.restresource.ReadyMadePizzaOrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReadyMadePizzaOrderResourceMapper implements ResourceMapper<ReadyMadePizzaOrderResource, ReadyMadePizzaOrder>
{
  @Autowired
  private SizeMapper sizeMapper;
  @Autowired
  private ReadyMadePizzaRepository readyMadePizzaRepository;

  @Override
  public ReadyMadePizzaOrder mapRestToModel(ReadyMadePizzaOrderResource restResource)
  {
    ReadyMadePizzaOrder pizzaOrder = new ReadyMadePizzaOrder();
    long readyMadePizzaId = restResource.getReadyMadePizzaId();
    ReadyMadePizza readyMadePizza = readyMadePizzaRepository.findById(readyMadePizzaId)
      .orElseThrow(() -> getResourceNotFoundException(readyMadePizzaId));
    pizzaOrder.setReadyMadePizza(readyMadePizza);
    pizzaOrder.setQuantity(restResource.getQuantity());
    pizzaOrder.setSize(sizeMapper.mapRestToModel(restResource.getSize()));

    return pizzaOrder;
  }

  @Override
  public ReadyMadePizzaOrderResource mapModelToRest(ReadyMadePizzaOrder modelData)
  {
    return null;
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("A Ready made pizza not exist with id : " + id);
  }
}
