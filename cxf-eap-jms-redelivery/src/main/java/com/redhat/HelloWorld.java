package com.redhat;

import javax.jws.WebService;

@WebService(targetNamespace = "http://hello.world.ns/")
public interface HelloWorld {
   public void submitOrder(Order order);
}

