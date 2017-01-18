package org.jboss.ws.jaxws.cxf.jms;

import javax.jws.WebService;
import org.jboss.ws.jaxws.cxf.jms.*;


@WebService
(
   portName = "HttpHelloWorldImplPort",
   serviceName = "HelloWorldService",
   wsdlLocation = "WEB-INF/wsdl/JMSHelloWorldService.wsdl",
   endpointInterface = "org.jboss.ws.jaxws.cxf.jms.HelloWorld",
   targetNamespace = "http://org.jboss.ws/jaxws/cxf/jms"
)
public class HTTPHelloWorldImpl implements HelloWorld {
	
	public String echo(String input)
	   {
	      return input;
	   }

	
//
	
/**	@WebService
(
   portName = "HttpHelloWorldImplPort",
   serviceName = "HelloWorldService",
   wsdlLocation = "WEB-INF/wsdl/HelloWorldService.wsdl",
   endpointInterface = "org.jboss.test.ws.jaxws.cxf.jms_http.HelloWorld",
   targetNamespace = "http://org.jboss.ws/jaxws/cxf/jms"
)
public class HttpHelloWorldImpl implements HelloWorld
{
   public String echo(String input)
   {
      System.out.println("input (http): " + input);
      return "(http) " + input;
   }
}
	**/
//	
	
	
}
