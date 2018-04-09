package com.kkd;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kkd.customerregisterservice.model.Customer;

@FeignClient(name="customer-details-service", url="http://10.151.60.178:8012")
public interface CustomerDetailsServiceProxy {
  
  @PostMapping("/customer/user")
  public ResponseEntity<HttpStatus> createCustomer(@RequestBody Customer customer);
  
  

}
