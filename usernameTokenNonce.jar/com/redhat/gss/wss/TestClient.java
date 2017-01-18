package com.redhat.gss.wss;
import java.util.*;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

public class TestClient{
  public static void main(String[]args){
     ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
     factory.setServiceClass(WsIntfc.class);
     factory.setAddress("http://localhost:8080/usernameToken/SecureService");
     WsIntfc port = (WsIntfc) factory.create(); 
	
     Client client = ClientProxy.getClient(port);
      Map<String,Object> outProps = new HashMap<String,Object>();	
      /*outProps.put("action", "UsernameToken Timestamp");
      outProps.put("passwordType", "PasswordText"); //remove this line if want to use plain text password
      outProps.put("user", "Viral");
      outProps.put("password", "RedHat13#");
      outProps.put("passwordCallbackClass", "com.redhat.gss.wss.KeystorePasswordCallback");	
      outProps.put("addUTElements","Nonce");*/	

	outProps.put(WSHandlerConstants.ACTION, "UsernameToken Timestamp");
outProps.put(WSHandlerConstants.USER, "Viral");
//outProps.put(WSHandlerConstants.PASSWORD, "RedHat13#");
outProps.put(WSHandlerConstants.PASSWORD_TYPE, "PasswordText");
outProps.put(WSHandlerConstants.MUST_UNDERSTAND, "true");
outProps.put(WSHandlerConstants.PW_CALLBACK_REF, new KeystorePasswordCallback());
outProps.put(WSHandlerConstants.ADD_USERNAMETOKEN_NONCE, "true");
outProps.put(WSHandlerConstants.ADD_USERNAMETOKEN_CREATED, "true");
	
      WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);

      client.getOutInterceptors().add(wssOut);

      port.sayHello("Viral");
  }
}
