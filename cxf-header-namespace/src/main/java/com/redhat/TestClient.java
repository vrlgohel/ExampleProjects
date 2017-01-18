package com.redhat;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Viral Gohel
 */
public class TestClient {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdl = new URL("http://localhost:8080/cxf-header-namespace-1.0-SNAPSHOT/HelloWS?wsdl");
        QName qname = new QName("http://redhat.com/", "HelloWS");
        Service service = Service.create(wsdl, qname);
        HelloWS port = service.getPort(HelloWS.class);
        System.out.println(port.hello("Viral Gohel, The CXF Master"));
    }
}
