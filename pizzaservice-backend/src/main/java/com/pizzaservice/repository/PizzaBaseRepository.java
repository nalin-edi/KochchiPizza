package com.pizzaservice.repository;

import com.pizzaservice.model.PizzaBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaBaseRepository extends JpaRepository<PizzaBase, Long>
{
}
