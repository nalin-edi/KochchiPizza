package com.pizzaservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "PizzaOrder")
public class PizzaOrder
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @OneToMany(mappedBy = "pizzaOrder", targetEntity = ReadyMadePizzaOrder.class, cascade = CascadeType.ALL)
  private Set<ReadyMadePizzaOrder> readyMadePizzaOrders;

  @OneToMany(mappedBy = "pizzaOrder", targetEntity = CustomPizzaOrder.class, cascade = CascadeType.ALL)
  private Set<CustomPizzaOrder> customPizzaOrders;

  @Column(name = "order_state")
  private OrderState orderState;

  @Column(name = "delivery_type")
  private DeliveryType deliveryType;

  @Column(name = "customer_name")
  private String customerName;

  @Column(name = "delivery_address")
  private String deliveryAddress;

  @Column(name = "contact_number")
  private String contactNumber;

  public PizzaOrder()
  {
  }

  public PizzaOrder(Set<ReadyMadePizzaOrder> readyMadePizzaOrders,
                    Set<CustomPizzaOrder> customPizzaOrders,
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

  public Set<ReadyMadePizzaOrder> getReadyMadePizzaOrders()
  {
    return readyMadePizzaOrders;
  }

  public void setReadyMadePizzaOrders(Set<ReadyMadePizzaOrder> readyMadePizzaOrders)
  {
    this.readyMadePizzaOrders = readyMadePizzaOrders;
  }

  public Set<CustomPizzaOrder> getCustomPizzaOrders()
  {
    return customPizzaOrders;
  }

  public void setCustomPizzaOrders(Set<CustomPizzaOrder> customPizzaOrders)
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
