package com.endava.rule.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * Entity for Customer.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Entity
@Table(name =  "customers")
public class Customer implements Serializable {

  private static final long serialVersionUID = 1993422469112967160L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  @Column(name = "cic")
  private String cic;

  public Customer() {
  }

  public Customer(String name, String address, String cic) {
    this.name = name;
    this.address = address;
    this.cic = cic;
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


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getCic() {
    return cic;
  }

  public void setCic(String cic) {
    this.cic = cic;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Customer customer = (Customer) o;
    return Objects.equals(name, customer.name) && Objects.equals(address, customer.address);
  }

  @Override public int hashCode() {

    return Objects.hash(name, address);
  }

  @Override public String toString() {
    return "Customer{" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' + ", cic='" + cic + '\'' + '}';
  }
}
