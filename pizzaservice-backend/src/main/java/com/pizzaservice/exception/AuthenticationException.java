package com.pizzaservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class AuthenticationException extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public AuthenticationException(String message)
  {
    super(message);
  }
}
