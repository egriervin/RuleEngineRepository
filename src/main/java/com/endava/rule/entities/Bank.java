package com.endava.rule.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Entity for Bank.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Entity
@Table(name = "banks")
public class Bank implements Serializable {

  private static final long serialVersionUID = -302692869078388739L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "bic")
  private String bic;

  public Bank() {
  }

  public Bank(String name, String bic) {
    this.name = name;
    this.bic = bic;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  @Override public String toString() {
    return "Bank{" + "id=" + id + ", name='" + name + '\'' + ", bic='" + bic + '\'' + '}';
  }
}
