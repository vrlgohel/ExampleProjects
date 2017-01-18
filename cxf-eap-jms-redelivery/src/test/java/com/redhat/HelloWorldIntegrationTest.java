package com.redhat;

import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

import client.HelloWorld;
import client.HelloWorldService;
import client.Person;

public class HelloWorldIntegrationTest {

    @Test
    public void testHelloWorld() throws Exception {
    	HelloWorldService service = new HelloWorldService(new URL("http://localhost:8080/cxf-eap-jms-redelivery/HelloWorldService?wsdl"));
    	HelloWorld port = service.getHelloWorldPort();
        Assert.assertEquals("Hello John", port.sayHi("John"));
        Order p = new Order();
        p.setName("Anne");
        p.setQty(100);
        Assert.assertEquals("Greetings Anne Li", port.submitOrder(p));
    }
}
