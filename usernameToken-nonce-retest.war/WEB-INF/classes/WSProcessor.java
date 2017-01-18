/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mil.navy.erm.nsips.mydeployment.stateless;

import javax.ejb.Stateless;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import  mil.navy.erm.nsips.mydeployment.SimpleService;
import  mil.navy.erm.nsips.mydeployment.SimpleService_Service;

/**
 *
 * @author larry.honeywood
 */
@Stateless
public class WSProcessor {
    
    @WebServiceRef(value = SimpleService_Service.class, wsdlLocation = "WEB-INF/wsdl/SimpleService.wsdl")
    SimpleService simpleService;
    
    
    
    public String sayHello(String name){
        
        ((BindingProvider) simpleService).getRequestContext().put("ws-security.username", "adeuser");
        ((BindingProvider) simpleService).getRequestContext().put("ws-security.password", "pass123");
        
        return simpleService.sayHello(name);
    }
    
}
