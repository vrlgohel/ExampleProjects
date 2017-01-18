package com.redhat;

import org.apache.cxf.annotations.Logging;
import org.jboss.logging.Logger;

import javax.jws.WebService;

/**
 * Created by Viral Gohel
 */
@WebService
@Logging(pretty = true)
public class HelloWSImpl implements HelloWS{
    private Logger logger=Logger.getLogger(this.getClass().getName());

    public String hello(String name) {
        try {
            logger.info("Hello : " + name);
            return "Hello : " + name;
        }catch (Exception e){
            logger.error("",e);
        }
        return "Hello : " + name;
    }
}
