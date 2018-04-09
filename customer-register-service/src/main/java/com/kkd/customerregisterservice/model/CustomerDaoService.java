package com.kkd.customerregisterservice.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CustomerDaoService {
  
  private static List<Customer> users = new ArrayList<Customer>();

  private static int usersCount = 1;

  static {
    users.add(new Customer(1,"KKDCUST00_1", "Adam","123","1234", "678"));
    
  }

  public List<Customer> findAll() {
    return users;
  }

  public Customer save(Customer user) {
    if (user.getCustomerId()==0) {
      user.setCustomerId(++usersCount);
    }
    user.setId("KKDCUST00_"+user.getCustomerId());
    users.add(user);
    return user;
  }

  public Customer findOne(int id) {
    for (Customer user : users) {
      if (user.getCustomerId() == id) {
        return user;
      }
    }
    return null;
  }


}
