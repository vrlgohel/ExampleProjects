package com.redhat;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.transform.TransformOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.jboss.logging.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Viral Gohel
 */
public class NamespaceChangeInterceptor extends AbstractPhaseInterceptor<Message>{
    private Logger logger=Logger.getLogger(this.getClass().getName());

    public NamespaceChangeInterceptor() {
        super(Phase.SETUP);
    }

    public void handleMessage(Message message) throws Fault {
        logger.warn("Configuring the interceptor now...");
        Map<String,String> appendElements=new HashMap<String, String>();
        appendElements.put("{http://schemas.xmlsoap.org/soap/envelope/}Body","{http://schemas.xmlsoap.org/soap/envelope/}Header=");
        TransformOutInterceptor transformOutInterceptor=new TransformOutInterceptor();
        transformOutInterceptor.setOutAppendElements(appendElements);
        message.getInterceptorChain().add(transformOutInterceptor);

        Map<String,String> envMap=new HashMap<String, String>();
        envMap.put("SOAP_ENV","http://schemas.xmlsoap.org/soap/envelope/");
        Map<String,String> nsMap=new HashMap<String, String>();
        nsMap.put( "https://www.ccr.gov" , "m" );
        JAXBDataBinding dataBinding = (JAXBDataBinding)message.getExchange().getEndpoint().getService().getDataBinding();
        dataBinding.setNamespaceMap(nsMap);
        message.put("soap.env.ns.map", envMap);
    }
}
