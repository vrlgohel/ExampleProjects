package com.redhat;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(endpointInterface = "com.redhat.HelloWorld",
            targetNamespace = "http://hello.world.ns/",
            name = "HelloWorld",
            serviceName = "HelloWorldService",
            portName = "HelloWorldPort")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class HelloWorldImpl implements HelloWorld {

    public void submitOrder(Order order) {
        if (order.getQty() < 5) {
            System.out.println("Order is now processed...." + "[" + order.toString() + "]");
        } /*else {
            try {
                MyException myException = new MyException("Brief Message.....");
                myException.setFrom("Viral, the CXF Expert");
                myException.setId(1001);
                myException.setMsg("This is a bad error!!!");
                throw myException;
            } catch (MyException e) {
                e.printStackTrace();
            }
        }*/
    }
}

