package com.redhat;

import org.apache.cxf.frontend.ServerFactoryBean;

import javax.xml.namespace.QName;

/**
 * Created by Viral Gohel
 */
public class TestServer {
    public static void main(String[] args) {
        ServerFactoryBean serverFactoryBean=new ServerFactoryBean();
        serverFactoryBean.setServiceBean(new MTOMServiceImpl());
        serverFactoryBean.setServiceClass(ImageService.class);
        serverFactoryBean.setServiceName(new QName("http://redhat.com/","ImageServiceService"));
        serverFactoryBean.setAddress("http://localhost:8080/mtomSchemaValidation");

        serverFactoryBean.create();

        System.out.println("Service started and Endpoint is deployed !!!");
    }
}
