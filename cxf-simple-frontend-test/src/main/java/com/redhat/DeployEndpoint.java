package com.redhat;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by Viral Gohel
 */
public class DeployEndpoint {
    private static final String ADDRRESS="http://localhost:9001/testFrontend";

    public static void main(String[] args) {
        ServerFactoryBean serverFactoryBean=new ServerFactoryBean();
        serverFactoryBean.setServiceClass(HelloWS.class);
        serverFactoryBean.setServiceBean(new HelloWSImpl());
        serverFactoryBean.setAddress(ADDRRESS);
        serverFactoryBean.create();
    }
}
