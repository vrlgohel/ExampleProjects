package com.redhat.gss.wss;

import java.net.URL;
import java.util.Map;
import java.util.HashMap;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.BindingProvider;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.jboss.logging.Logger;
import mil.navy.erm.nsips.mydeployment.SimpleServiceInt;

public class SecureClient
{
  private Logger log = Logger.getLogger(this.getClass().getName());

  public static void main(String[] args) throws Exception
  {
    SecureClient client = new SecureClient();
    client.invoke();
  }

  public void invoke() throws Exception
  {
    //Create JAX-WS client
    URL wsdl = new URL("http://localhost:8080/WS_SIMPLE_WS/SimpleService?wsdl");
    QName serviceNS = new QName("urn:mil:navy:erm:ade:esb:SimpleService", "SimpleService");
    QName portNS = new QName("urn:mil:navy:erm:ade:esb:SimpleService", "SimpleServicePort");
    Service service = Service.create(wsdl, serviceNS);
    SimpleServiceInt port = service.getPort(portNS, SimpleServiceInt.class);
    Map<String, Object> ctx = ((BindingProvider)port).getRequestContext();
    ctx.put("ws-security.username", "Viral");

    ctx.put("ws-security.password", "RedHat13#");

    //Invoke client
    log.info("Output of sayHello operation: " + port.sayHello("Viral"));
  }
}
