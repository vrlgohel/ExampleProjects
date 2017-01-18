package com.redhat;

import javax.jws.WebService;

/**
 * Created by Viral Gohel
 */
@WebService(serviceName = "OrderService",portName = "OrderServicePort",targetNamespace = "http://redhat.com/")
public interface OrderService {
    public void submitOrder(Order order);
}
