package com.redhat;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by Viral Gohel
 */
public class TestServer {
    public static void main(String[] args) {
        ServerFactoryBean serverFactoryBean=new ServerFactoryBean();
        serverFactoryBean.setServiceBean(new MTOMServiceImpl());
        serverFactoryBean.setServiceClass(ImageService.class);
        serverFactoryBean.setAddress("http://localhost:9090/mtomSchemaValidation");

        serverFactoryBean.create();

        System.out.println("Service started and Endpoint is deployed !!!");
    }
}
