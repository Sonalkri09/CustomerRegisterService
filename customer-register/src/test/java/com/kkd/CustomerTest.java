package com.kkd;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.kkd.model.Customer;
import com.kkd.model.CustomerDaoService;

public class CustomerTest {
  
  @Autowired
  private MockMvc mockMvc;
  
  @Mock
  private CustomerDaoService customerDaoService;

  
  @InjectMocks
  private Customer customer;
  
  @Before
  public void setUp() throws Exception{
    mockMvc = MockMvcBuilders.standaloneSetup(customer).build();
    
  }

  @Test
  public void Testget() throws Exception {
    

    mockMvc.perform(get("/users")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  
}
