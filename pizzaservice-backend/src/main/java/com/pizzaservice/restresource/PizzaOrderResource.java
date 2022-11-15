package com.pizzaservice.restresource;

import com.pizzaservice.model.DeliveryType;
import com.pizzaservice.model.OrderState;

import java.util.Set;

public class PizzaOrderResource
{
  private Set<ReadyMadePizzaOrderResource> readyMadePizzaOrders;
  private Set<CustomPizzaOrderResource> customPizzaOrders;
  private OrderState orderState;
  private DeliveryType deliveryType;
  private String customerName;
  private String deliveryAddress;
  private String contactNumber;

  public PizzaOrderResource(Set<ReadyMadePizzaOrderResource> readyMadePizzaOrders,
                            Set<CustomPizzaOrderResource> customPizzaOrders,
                            OrderState orderState,
                            DeliveryType deliveryType,
                            String customerName,
                            String deliveryAddress,
                            String contactNumber)
  {
    this.readyMadePizzaOrders = readyMadePizzaOrders;
    this.customPizzaOrders = customPizzaOrders;
    this.orderState = orderState;
    this.deliveryType = deliveryType;
    this.customerName = customerName;
    this.deliveryAddress = deliveryAddress;
    this.contactNumber = contactNumber;
  }

  public Set<ReadyMadePizzaOrderResource> getReadyMadePizzaOrders()
  {
    return readyMadePizzaOrders;
  }

  public void setReadyMadePizzaOrders(Set<ReadyMadePizzaOrderResource> readyMadePizzaOrders)
  {
    this.readyMadePizzaOrders = readyMadePizzaOrders;
  }

  public Set<CustomPizzaOrderResource> getCustomPizzaOrders()
  {
    return customPizzaOrders;
  }

  public void setCustomPizzaOrders(Set<CustomPizzaOrderResource> customPizzaOrders)
  {
    this.customPizzaOrders = customPizzaOrders;
  }

  public OrderState getOrderState()
  {
    return orderState;
  }

  public void setOrderState(OrderState orderState)
  {
    this.orderState = orderState;
  }

  public DeliveryType getDeliveryType()
  {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryType deliveryType)
  {
    this.deliveryType = deliveryType;
  }

  public String getCustomerName()
  {
    return customerName;
  }

  public void setCustomerName(String customerName)
  {
    this.customerName = customerName;
  }

  public String getDeliveryAddress()
  {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress)
  {
    this.deliveryAddress = deliveryAddress;
  }

  public String getContactNumber()
  {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber)
  {
    this.contactNumber = contactNumber;
  }
}
