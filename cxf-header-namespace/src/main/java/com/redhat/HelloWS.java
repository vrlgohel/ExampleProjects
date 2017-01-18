package com.redhat;

import javax.jws.WebService;

/**
 * Created by Viral Gohel
 */
@WebService(portName = "hello")
public interface HelloWS {
    public String hello(String name);
}
