package com.pizzaservice.controller;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.PizzaBase;
import com.pizzaservice.repository.PizzaBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RequestMapping("/api/v1/")
public class PizzaBaseController
{
  @Autowired
  private PizzaBaseRepository pizzaBaseRepository;

  @GetMapping("/pizza-bases")
  public List<PizzaBase> getAllPizzaBases()
  {
    return pizzaBaseRepository.findAll();
  }

  @PostMapping("/pizza-bases/create")
  public PizzaBase createPizzaBase(@RequestBody PizzaBase pizzaBase)
  {
    return pizzaBaseRepository.save(pizzaBase);
  }

  @GetMapping("/pizza-bases/{id}")
  public ResponseEntity<PizzaBase> getPizzaBaseById(@PathVariable Long id)
  {
    PizzaBase
      pizzaBase = pizzaBaseRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    return ResponseEntity.ok(pizzaBase);
  }

  @PutMapping("/pizza-bases/{id}")
  public ResponseEntity<PizzaBase> updatePizzaBase(@PathVariable Long id, @RequestBody PizzaBase pizzaBaseData)
  {
    PizzaBase
      pizzaBase = pizzaBaseRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));

    pizzaBase.setDescription(pizzaBaseData.getDescription());
    pizzaBase.setUnitPrice(pizzaBaseData.getUnitPrice());
    PizzaBase updatedPizzaBase = pizzaBaseRepository.save(pizzaBase);
    return ResponseEntity.ok(updatedPizzaBase);
  }

  @DeleteMapping("/pizza-bases/{id}")
  public ResponseEntity<Map<String, Boolean>> deletePizzaBase(@PathVariable Long id)
  {
    PizzaBase
      pizzaBase = pizzaBaseRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    pizzaBaseRepository.delete(pizzaBase);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("A Pizza Base not exist with id : " + id);
  }
}
