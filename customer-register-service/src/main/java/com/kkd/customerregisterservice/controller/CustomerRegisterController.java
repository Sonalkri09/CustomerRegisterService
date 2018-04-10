package com.kkd.customerregisterservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kkd.customerregisterservice.model.Customer;
import com.kkd.customerregisterservice.model.CustomerDaoService;

@RestController
public class CustomerRegisterController {
  
  @Autowired
  private CustomerDaoService users;
 
  @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Customer> retrieveAllUsers() {
    return users.findAll();
  }
  
  @PostMapping("/users")
  public void createUser(@RequestBody Customer user) {
    Customer savedUser = users.save(user);
  }
  
}
