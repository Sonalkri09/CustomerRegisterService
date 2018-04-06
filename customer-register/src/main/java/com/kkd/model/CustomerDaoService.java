package com.kkd.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CustomerDaoService {
  
  private static List<Customer> users = new ArrayList<>();

  private static int usersCount = 1;

  static {
    users.add(new Customer(1, "Adam","123","1234", "678"));
    
  }

  public List<Customer> findAll() {
    return users;
  }

  public Customer save(Customer user) {
    if (user.getCustomerId()==0) {
      user.setCustomerId(++usersCount);
    }
    user.setCustomerId(user.getCustomerId()+"_KKD");
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
