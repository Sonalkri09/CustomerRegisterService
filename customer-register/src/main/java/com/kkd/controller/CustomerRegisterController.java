package com.kkd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkd.model.Customer;
import com.kkd.model.CustomerDaoService;

@RestController
public class CustomerRegisterController {
  
  @Autowired
  private CustomerDaoService users;
  
  /*@GetMapping("/customer")
  public Customer firstpage() {
    //Customer user= new Customer();
    user.setCustomerId();
    user.setMobileNo("123");
    user.setPassword("456");
    user.setFirstName("sonal");
    user.setLastName("kri");
     return user;
  }*/
  
  @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Customer> retrieveAllUsers() {
    return users.findAll();
  }
  
  @PostMapping("/users")
  public void createUser(@RequestBody Customer user) {
    Customer savedUser = users.save(user);
  }

}
