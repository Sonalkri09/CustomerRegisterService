package com.kkd.customerregisterservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
  
  @Id
  @GeneratedValue
  private int customerId;
  private String id;
  
  private String mobileNo;
  private String password;
  private String firstName;
  private String lastName;
  
  protected Customer() {
  }
  
  public Customer(int i,String id, String string, String string2, String string3, String string4) {
    // TODO Auto-generated constructor stub
    super();
    this.id=id;
    this.customerId=i;
    this.mobileNo=string;
    this.password=string2;
    this.firstName=string3;
    this.lastName=string4;
  }

  
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getCustomerId() {
    return customerId;
  }
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  public String getMobileNo() {
    return mobileNo;
  }
  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ",Id=" + id + ", mobileNo=" + mobileNo + ", password=" + password + ", firstName="
        + firstName + ", lastName=" + lastName + "]";
  }

  



}
