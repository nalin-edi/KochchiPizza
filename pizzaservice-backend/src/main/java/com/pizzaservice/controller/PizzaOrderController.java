package com.pizzaservice.controller;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.mapper.PizzaOrderResourceMapper;
import com.pizzaservice.model.OrderState;
import com.pizzaservice.model.PizzaOrder;
import com.pizzaservice.repository.PizzaOrderRepository;
import com.pizzaservice.restresource.PizzaOrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class PizzaOrderController
{
  @Autowired
  private PizzaOrderRepository pizzaOrderRepository;
  @Autowired
  private PizzaOrderResourceMapper pizzaOrderResourceMapper;

  @GetMapping("/pizza-order")
  public List<PizzaOrder> getAllPizzaOrders()
  {
    return pizzaOrderRepository.findAll();
  }

  @PostMapping("/pizza-order/create")
  public PizzaOrder createPizzaOrder(@RequestBody PizzaOrderResource pizzaOrderResource)
  {
    return pizzaOrderRepository.save(pizzaOrderResourceMapper.mapRestToModel(pizzaOrderResource));
  }


  @GetMapping("/pizza-order/{id}")
  public ResponseEntity<PizzaOrder> getPizzaOrderById(@PathVariable Long id)
  {
    PizzaOrder
      pizzaOrder = pizzaOrderRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    return ResponseEntity.ok(pizzaOrder);
  }

  @PutMapping("/pizza-order/{id}")
  public ResponseEntity<PizzaOrder> updatePizzaOrder(@PathVariable Long id, @RequestBody PizzaOrderResource pizzaOrderResource)
  {
    PizzaOrder
      pizzaOrder = pizzaOrderRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));

    PizzaOrder pizzaOrderData = pizzaOrderResourceMapper.mapRestToModel(pizzaOrderResource);

    pizzaOrder.setReadyMadePizzaOrders(pizzaOrderData.getReadyMadePizzaOrders());
    pizzaOrder.setCustomPizzaOrders(pizzaOrderData.getCustomPizzaOrders());
    pizzaOrder.setOrderState(pizzaOrderData.getOrderState());
    pizzaOrder.setDeliveryType(pizzaOrderData.getDeliveryType());
    pizzaOrder.setCustomerName(pizzaOrderData.getCustomerName());
    pizzaOrder.setDeliveryAddress(pizzaOrderData.getDeliveryAddress());
    pizzaOrder.setContactNumber(pizzaOrderData.getContactNumber());

    PizzaOrder updatedPizzaOrder = pizzaOrderRepository.save(pizzaOrder);
    return ResponseEntity.ok(updatedPizzaOrder);
  }

  @PatchMapping("/pizza-order/{id}")
  public ResponseEntity<PizzaOrder> updatePizzaOrderState(@PathVariable Long id, @RequestBody OrderState state)
  {
    PizzaOrder
      pizzaOrder = pizzaOrderRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    pizzaOrder.setOrderState(state);
    return ResponseEntity.ok(pizzaOrder);
  }

  @DeleteMapping("/pizza-order/{id}")
  public ResponseEntity<Map<String, Boolean>> deletePizzaOrder(@PathVariable Long id)
  {
    PizzaOrder
      pizzaOrder = pizzaOrderRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    pizzaOrderRepository.delete(pizzaOrder);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("A Pizza order not exist with id : " + id);
  }
}
