package com.pizzaservice.controller;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.PizzaTopping;
import com.pizzaservice.repository.PizzaToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
public class PizzaToppingController
{
  @Autowired
  private PizzaToppingRepository pizzaToppingRepository;

  @GetMapping("/pizza-toppings")
  public List<PizzaTopping> getAllPizzaToppings()
  {
    return pizzaToppingRepository.findAll();
  }

  @PostMapping("/pizza-toppings/create")
  public PizzaTopping createPizzaTopping(@RequestBody PizzaTopping pizzaTopping)
  {
    return pizzaToppingRepository.save(pizzaTopping);
  }

  @GetMapping("/pizza-toppings/{id}")
  public ResponseEntity<PizzaTopping> getPizzaToppingById(@PathVariable Long id)
  {
    PizzaTopping
      pizzaTopping = pizzaToppingRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    return ResponseEntity.ok(pizzaTopping);
  }

  @PutMapping("/pizza-toppings/{id}")
  public ResponseEntity<PizzaTopping> updatePizzaTopping(@PathVariable Long id, @RequestBody PizzaTopping pizzaToppingData)
  {
    PizzaTopping
      pizzaTopping = pizzaToppingRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));

    pizzaTopping.setDescription(pizzaToppingData.getDescription());
    pizzaTopping.setUnitPrice(pizzaToppingData.getUnitPrice());
    PizzaTopping updatedPizzaTopping = pizzaToppingRepository.save(pizzaTopping);
    return ResponseEntity.ok(updatedPizzaTopping);
  }

  @DeleteMapping("/pizza-toppings/{id}")
  public ResponseEntity<Map<String, Boolean>> deletePizzaTopping(@PathVariable Long id)
  {
    PizzaTopping
      pizzaTopping = pizzaToppingRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    pizzaToppingRepository.delete(pizzaTopping);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("A Pizza Topping not exist with id : " + id);
  }
}
