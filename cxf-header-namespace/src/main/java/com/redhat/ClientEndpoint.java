package com.redhat;

import org.jboss.logging.Logger;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Viral Gohel
 */
@WebService
public class ClientEndpoint {
    private Logger logger=Logger.getLogger(this.getClass().getName());

    public String invokeHelloWorld(String name) throws MalformedURLException {
        QName serviceName = new QName("http://redhat.com/", "HelloWS");
        URL wsdl = new URL("http://localhost:8080/cxf-header-namespace-1.0-SNAPSHOT/ClientEndpoint?wsdl");
        Service service = Service.create(wsdl, serviceName);
        HelloWS port = service.getPort(HelloWS.class);
        return port.hello("Viral Gohel, The CXF Master");
    }
}
