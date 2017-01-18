
package org.jboss.jboss_jdf.jboss_as_quickstart.wsat.simple.restaurant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.jboss_jdf.jboss_as_quickstart.wsat.simple.restaurant package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RestaurantException_QNAME = new QName("http://www.jboss.org/jboss-jdf/jboss-as-quickstart/wsat/simple/Restaurant", "RestaurantException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.jboss_jdf.jboss_as_quickstart.wsat.simple.restaurant
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RestaurantException }
     * 
     */
    public RestaurantException createRestaurantException() {
        return new RestaurantException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaurantException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/jboss-jdf/jboss-as-quickstart/wsat/simple/Restaurant", name = "RestaurantException")
    public JAXBElement<RestaurantException> createRestaurantException(RestaurantException value) {
        return new JAXBElement<RestaurantException>(_RestaurantException_QNAME, RestaurantException.class, null, value);
    }

}
