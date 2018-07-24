package com.endava.rule.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Entity for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Entity
@Table(name =  "payment_methods")
public class PaymentMethod implements Serializable {

  private static final long serialVersionUID = 2434183953820735778L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "bank_id")
  private long bankId;

  @Column(name = "payment_method")
  private String paymentMethod;

  public PaymentMethod() {
  }

  public PaymentMethod(long bankId, String paymentMethod) {
    this.bankId = bankId;
    this.paymentMethod = paymentMethod;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBankId() {
    return bankId;
  }

  public void setBankId(long bankId) {
    this.bankId = bankId;
  }


  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override public String toString() {
    return "PaymentMethod{" + "id=" + id + ", bankId=" + bankId + ", paymentMethod='" + paymentMethod + '\'' + '}';
  }
}
