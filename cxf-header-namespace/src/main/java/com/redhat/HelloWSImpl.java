package com.redhat;
import org.apache.cxf.annotations.Logging;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.jboss.logging.Logger;

import javax.jws.WebService;

/**
 * Created by Viral Gohel
 */
@WebService(serviceName = "HelloWS",portName = "hello", wsdlLocation = "HelloWS.wsdl")
@Logging(pretty = true)
@OutInterceptors(classes={
        com.redhat.NamespaceChangeInterceptor.class
})
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
public class HelloWSImpl implements HelloWS{
    private Logger logger=Logger.getLogger(this.getClass().getName());
    public String hello(String name) {
        try {
            logger.info("Hello : "+ name);
            return "Hello : " + name;
        }catch (Exception e){
            logger.error("",e);
            return "Fail";
        }
    }
}
