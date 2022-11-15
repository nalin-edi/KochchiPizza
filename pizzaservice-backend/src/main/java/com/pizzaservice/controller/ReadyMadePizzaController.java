package com.pizzaservice.controller;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.ReadyMadePizza;
import com.pizzaservice.repository.ReadyMadePizzaRepository;
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
public class ReadyMadePizzaController
{
  @Autowired
  private ReadyMadePizzaRepository readyMadePizzaRepository;

  @GetMapping("/ready-made-pizza")
  public List<ReadyMadePizza> getAllReadyMadePizza()
  {
    return readyMadePizzaRepository.findAll();
  }

  @PostMapping("/ready-made-pizza/create")
  public ReadyMadePizza createReadyMadePizza(@RequestBody ReadyMadePizza readyMadePizza)
  {
    return readyMadePizzaRepository.save(readyMadePizza);
  }

  @GetMapping("/ready-made-pizza/{id}")
  public ResponseEntity<ReadyMadePizza> getReadyMadePizzaById(@PathVariable Long id)
  {
    ReadyMadePizza
      readyMadePizza = readyMadePizzaRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    return ResponseEntity.ok(readyMadePizza);
  }

  @PutMapping("/ready-made-pizza/{id}")
  public ResponseEntity<ReadyMadePizza> updateReadyMadePizza(@PathVariable Long id, @RequestBody ReadyMadePizza readyMadePizzaData)
  {
    ReadyMadePizza
      readyMadePizza = readyMadePizzaRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));

    readyMadePizza.setType(readyMadePizzaData.getType());
    readyMadePizza.setDescription(readyMadePizzaData.getDescription());
    readyMadePizza.setUnitPrice(readyMadePizzaData.getUnitPrice());
    readyMadePizza.setImagePath(readyMadePizzaData.getImagePath());
    ReadyMadePizza updatedReadyMadePizza = readyMadePizzaRepository.save(readyMadePizza);
    return ResponseEntity.ok(updatedReadyMadePizza);
  }

  @DeleteMapping("/ready-made-pizza/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteReadyMadePizza(@PathVariable Long id)
  {
    ReadyMadePizza
      readyMadePizza = readyMadePizzaRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    readyMadePizzaRepository.delete(readyMadePizza);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("A Ready made pizza not exist with id : " + id);
  }
}
