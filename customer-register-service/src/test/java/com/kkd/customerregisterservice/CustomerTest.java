package com.kkd.customerregisterservice;

import java.util.ArrayList;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kkd.customerregisterservice.controller.CustomerRegisterController;
import com.kkd.customerregisterservice.model.Customer;
import com.kkd.customerregisterservice.model.CustomerDaoService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(CustomerRegisterController.class)
public class CustomerTest {
  
  @Autowired
  private MockMvc mockMvc;
  
  @MockBean
  private CustomerDaoService customerDaoService;

  Customer customer = new Customer(1,"1_KKD", "Adam","123","1234", "678");
  List<Customer> customers = new ArrayList<Customer>();
  
  @Before
  public void before() {
    
    
  }

  @Test
  public void viewProductsTest(){
    
    customers.add(customer);
    Mockito.when(
        customerDaoService.findAll()).thenReturn(customers);
    RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
        "/users").accept(
        MediaType.APPLICATION_JSON);
    try {
      
    
    MvcResult result = mockMvc.perform(requestBuilder).andReturn();
    System.out.println(result.getResponse().getContentAsString());
    String expected =  "[{\"customerId\":1,\"id\":\"1_KKD\",\"mobileNo\":\"Adam\",\"password\":\"123\",\"firstName\":\"1234\",\"lastName\":\"678\"}]";


    JSONAssert.assertEquals(expected, result.getResponse()
        .getContentAsString(), false);
    
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }


  }
  
  @Test
  public void viProductsTest(){
    
    customers.add(customer);
    Mockito.when(
        customerDaoService.findAll()).thenReturn(customers);
    RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
        "/users").accept(
        MediaType.APPLICATION_JSON);
    try {
   
    MvcResult result = mockMvc.perform(requestBuilder).andReturn();
    System.out.println(result.getResponse().getContentAsString());
    String expected =  "[{\"customerId\":1,\"id\":\"1_KKD\",\"mobileNo\":\"Adam\",\"password\":\"123\",\"firstName\":\"1234\",\"lastName\":\"678\"}]";

    JSONAssert.assertEquals(expected, result.getResponse()
        .getContentAsString(), false);
    
    
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }


  }
  
  @Test
  public void viwProductsTest(){
    
    customers.add(customer);
    Mockito.when(
        customerDaoService.findAll()).thenReturn(customers);
    RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
        "/users").accept(
        MediaType.APPLICATION_JSON);
    try {
      
    
    MvcResult result = mockMvc.perform(requestBuilder).andReturn();
    System.out.println(result.getResponse().getContentAsString());
    String expected =  "[{\"customerId\":1,\"id\":\"1_KD\",\"mobileNo\":\"Adam\",\"password\":\"123\",\"firstName\":\"1234\",\"lastName\":\"678\"}]";

    JSONAssert.assertNotEquals(expected, result.getResponse()
        .getContentAsString(), false);
  
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
