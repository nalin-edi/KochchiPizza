package com.pizzaservice.controller;

import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.Employee;
import com.pizzaservice.repository.EmployeeRepository;
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
public class EmployeeController
{
  @Autowired
  private EmployeeRepository employeeRepository;

  @GetMapping("/employees")
  public List<Employee> getAllEmployees()
  {
    return employeeRepository.findAll();
  }

  @PostMapping("/employees/create")
  public Employee createEmployee(@RequestBody Employee user)
  {
    return employeeRepository.save(user);
  }

  @GetMapping("/employees/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
  {
    Employee
      user = employeeRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    return ResponseEntity.ok(user);
  }

  @PutMapping("/employees/{id}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeData)
  {
    Employee
      employee = employeeRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));

    employee.setFirstName(employeeData.getFirstName());
    employee.setLastName(employeeData.getLastName());
    employee.setUserName(employeeData.getUserName());
    employee.setPassword(employeeData.getPassword());
    employee.setRole(employeeData.getRole());

    Employee updatedUser = employeeRepository.save(employee);
    return ResponseEntity.ok(updatedUser);
  }

  @DeleteMapping("/employees/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id)
  {
    Employee
      employee = employeeRepository.findById(id).orElseThrow(() -> getResourceNotFoundException(id));
    employeeRepository.delete(employee);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }

  private ResourceNotFoundException getResourceNotFoundException(Long id)
  {
    return new ResourceNotFoundException("An Employee not exist with id : " + id);
  }

}
