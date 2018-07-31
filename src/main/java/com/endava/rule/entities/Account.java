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
 * Entity for Account.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Entity
@Table(name =  "customers")
public class Account implements Serializable {

  private static final long serialVersionUID = -427029501490527248L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column (name = "uuid")
  private long uuid;

  @Column(name = "bank_id")
  private long bankId;

  @Column(name = "customer_id")
  private long customerId;

  @Column(name = "balance")
  private double balance;

  public Account() {
  }

  public Account(long bankId, long customerId, double balance) {
    this.bankId = bankId;
    this.customerId = customerId;
    this.balance = balance;
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


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Account account = (Account) o;
    return bankId == account.bankId && customerId == account.customerId && Double.compare(account.balance, balance) == 0;
  }

  @Override public int hashCode() {

    return Objects.hash(bankId, customerId, balance);
  }

  @Override public String toString() {
    return "Account{" + "id=" + id + ", bankId=" + bankId + ", customerId=" + customerId + ", balance=" + balance + '}';
  }
}
