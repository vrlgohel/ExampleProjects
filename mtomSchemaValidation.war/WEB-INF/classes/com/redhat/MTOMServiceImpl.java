package com.redhat;


import org.apache.cxf.annotations.SchemaValidation;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.MTOM;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by Viral Gohel
 */
@WebService(targetNamespace = "http://redhat.com/",serviceName = "ImageServiceService",portName = "ImageServicePort")
@SchemaValidation
@MTOM
@org.jboss.ws.api.annotation.EndpointConfig(configName="SwitchYard-Endpoint-Config",configFile="WEB-INF/jaxws-endpoint-config.xml")
public class MTOMServiceImpl implements ImageService {
    /**
     * @param image @return returns byte[]
     */
    public byte[] resizeImage(byte[] image) {
        try {
            BufferedImage bufferedImage=ImageIO.read(new File(String.valueOf(image)));
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            ImageIO.write(bufferedImage,"jpeg",byteArrayOutputStream);
            byteArrayOutputStream.flush();
            image=byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}

