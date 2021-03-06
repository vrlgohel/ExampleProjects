package org.jboss.jboss_jdf.jboss_as_quickstart.wsat.simple.restaurant;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621090
 * 2016-12-19T20:59:11.952+05:30
 * Generated source version: 3.0.4.redhat-621090
 * 
 */
@WebServiceClient(name = "RestaurantServiceATService", 
                  wsdlLocation = "WEB-INF/wsdl/RestaurantServiceAT.wsdl",
                  targetNamespace = "http://www.jboss.org/jboss-jdf/jboss-as-quickstart/wsat/simple/Restaurant") 
public class RestaurantServiceATService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.jboss.org/jboss-jdf/jboss-as-quickstart/wsat/simple/Restaurant", "RestaurantServiceATService");
    public final static QName RestaurantServiceAT = new QName("http://www.jboss.org/jboss-jdf/jboss-as-quickstart/wsat/simple/Restaurant", "RestaurantServiceAT");
    static {
        URL url = null;
        try {
            url = new URL("file:RestaurantServiceAT.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RestaurantServiceATService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:RestaurantServiceAT.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RestaurantServiceATService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RestaurantServiceATService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantServiceATService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RestaurantServiceATService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RestaurantServiceATService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RestaurantServiceATService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns RestaurantServiceAT
     */
    @WebEndpoint(name = "RestaurantServiceAT")
    public RestaurantServiceAT getRestaurantServiceAT() {
        return super.getPort(RestaurantServiceAT, RestaurantServiceAT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RestaurantServiceAT
     */
    @WebEndpoint(name = "RestaurantServiceAT")
    public RestaurantServiceAT getRestaurantServiceAT(WebServiceFeature... features) {
        return super.getPort(RestaurantServiceAT, RestaurantServiceAT.class, features);
    }

}
