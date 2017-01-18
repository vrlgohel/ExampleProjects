package com.redhat;

import javax.jws.WebService;

/**
 * Created by Viral Gohel
 */
@WebService(serviceName = "OrderService",portName = "OrderServicePort",targetNamespace = "http://redhat.com/")
public class OrderServiceImpl implements OrderService {
    public void submitOrder(Order order) {
        if (order.getQty() < 5) {
            System.out.println("order = [" + order + "]");

        } else {
            try {
                MyException myException = new MyException("Brief Message...");
                myException.setFrom("Viral, The CXF Expert");
                myException.setSummary("The error is really bad... gonna retry");
                myException.setId(10001);
                throw myException;
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
