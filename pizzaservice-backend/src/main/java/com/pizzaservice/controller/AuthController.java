package com.pizzaservice.controller;

import com.pizzaservice.exception.AuthenticationException;
import com.pizzaservice.exception.ResourceNotFoundException;
import com.pizzaservice.model.Employee;
import com.pizzaservice.repository.EmployeeRepository;
import com.pizzaservice.restresource.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class AuthController
{
  @Autowired private EmployeeRepository employeeRepository;

  @PostMapping("/login")
  public ResponseEntity<Auth> getAuth(@RequestBody Auth auth)
  {
    Employee employee =
      employeeRepository.findByUserName(auth.getUserName()).orElseThrow(this::getResourceNotFoundException);

    if (auth.getPassword().equals(employee.getPassword()))
    {
      Auth response = new Auth(String.valueOf(employee.getId()),
                               employee.getFirstName(),
                               employee.getLastName(),
                               employee.getUserName(),
                               employee.getPassword(),
                               employee.getRole().name());
      return ResponseEntity.ok(response);
    }
    else
    {
      throw new AuthenticationException("Incorrect Password");
    }

  }

  private ResourceNotFoundException getResourceNotFoundException()
  {
    return new ResourceNotFoundException("User is not registered");
  }

}
