package com.endava.rule.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Entity for Product.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Entity
@Table(name =  "products")
public class Product implements Serializable {

  private static final long serialVersionUID = 3192611199930325511L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "quantity")
  private String quantity;

  @Column(name = "price")
  private double price;

  public Product() {
  }

  public Product(String name, String quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override public String toString() {
    return "Product{" + "id=" + id + ", name='" + name + '\'' + ", quantity='" + quantity + '\'' + ", price=" + price + '}';
  }
}
