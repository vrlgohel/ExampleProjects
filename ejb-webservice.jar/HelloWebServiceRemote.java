package com.redhat.service;

import javax.ejb.Remote;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@Remote
@javax.jws.WebService(wsdlLocation="META-INF/wsdl/HelloServiceService.wsdl")
//@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface HelloWebServiceRemote 
{
	void sayHello(String name);
	 void calculate(int x, int y);
}
