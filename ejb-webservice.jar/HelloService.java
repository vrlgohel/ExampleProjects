package com.redhat.service;

import javax.ejb.Stateless;
import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
//import org.jboss.ws.api.annotation.WebContext;
//import org.jboss.ejb3.annotation.SecurityDomain;
//import javax.annotation.security.RolesAllowed;

@WebService
//@WebContext(transportGuarantee = "NONE")
//@SecurityDomain("test-security-domain")
//@RolesAllowed("JBossAdmin")
@Stateless
@org.apache.cxf.annotations.Logging(pretty=true, limit= 1024)
//@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)		
public class HelloService implements HelloWebServiceRemote
{
	//@WebMethod(operationName = "hello")
	public void sayHello(String name)
	{
		System.out.println("Hello JBoss! I am "+ name);
	}

	public void calculate(int x, int y)
	{
		System.out.println("Tye addition is "+( x+y));
	}
}
