package com.kkd;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkd.customerregisterservice.CustomerRegisterApplication;



@Service
public class MessageSender {

  //autowired a template of rabbitmq to send a message
  @Autowired
  private AmqpTemplate amqpTemplate;
      
  public void produceMsg(String msg){
    //using the template defining the needed parameters- exchange name,key and message
    amqpTemplate.convertAndSend(CustomerRegisterApplication.EXCHANGE_NAME, CustomerRegisterApplication.ROUTING_KEY, msg);
    System.out.println("Send msg = " + msg);
  }
}
