package com.pizzaservice.mapper;

public interface ResourceMapper<R, M>
{
  M mapRestToModel(R restResource);

  R mapModelToRest(M modelData);
}
