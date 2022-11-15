package com.pizzaservice.repository;

import com.pizzaservice.model.ReadyMadePizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadyMadePizzaRepository extends JpaRepository<ReadyMadePizza, Long>
{
}
