/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mil.navy.erm.nsips.mydeployment;

import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.EndpointConfig;
import org.jboss.ws.api.annotation.WebContext;

/**
 *
 * @author larry.honeywood
 */

//The set of annotations should be blindly copied

@Stateless
@LocalBean
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config.xml", configName = "Custom WS-Security Endpoint")
@SecurityDomain("other")
@SchemaValidation
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@InInterceptors(interceptors = {"org.jboss.wsf.stack.cxf.security.authentication.SubjectCreatingPolicyInterceptor", "org.apache.cxf.interceptor.LoggingInInterceptor"})
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")

//This set of annotations should be copied but modified as required
@RolesAllowed("hello")
@WebService(serviceName = "SimpleService", targetNamespace = "urn:mil:navy:erm:ade:esb:SimpleService", wsdlLocation="WEB-INF/wsdl/SimpleService.wsdl")
@WebContext(urlPattern="/SimpleService")
public class SimpleService {
        
    @WebMethod(operationName="sayHello")
    @WebResult(name="sayHelloResponse")
    public String sayHello(@WebParam(name="sayHello")String name){           
        return "Hello " + name + "!";        
    }
                
}
    
    

