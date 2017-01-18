package org.jboss.ws.jaxws.cxf.jms;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebService;
import org.jboss.ws.jaxws.cxf.jms.*;


@WebService
(
   
   portName = "HelloWorldImplPort",
   serviceName = "HelloWorldServiceLocal",
   wsdlLocation = "WEB-INF/wsdl/JMSHelloWorldService.wsdl",
   endpointInterface = "org.jboss.ws.jaxws.cxf.jms.HelloWorld",
   targetNamespace = "http://org.jboss.ws/jaxws/cxf/jms"
   
)
//@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class HelloWorldImpl implements HelloWorld {
	
	public String echo(String input)
	   {
		  System.out.println("Returing message :HelloWorldServiceLocal:From JMS"+input);
		  if(input.equals("createNull"))
			  System.out.println("nullpointer exception"+input);
	      return input;
	   }

	
//
	
/**	@WebService
	(
	   portName = "HelloWorldImplPort",
	   serviceName = "HelloWorldServiceLocal",
	   wsdlLocation = "META-INF/wsdl/HelloWorldService.wsdl",
	   endpointInterface = "org.jboss.test.ws.jaxws.cxf.jms.HelloWorld",
	   targetNamespace = "http://org.jboss.ws/jaxws/cxf/jms"
	)
	public class HelloWorldImpl implements HelloWorld
	{
	   public String echo(String input)
	   {
	      System.out.println("input: " + input);
	      return input;
	   }
	}	

	**/
//	
	
	
}
