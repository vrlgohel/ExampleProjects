
package org.wsdlgetproblem.xsd.test.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.wsdlgetproblem.xsd.test.common.CommonRequestType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.wsdlgetproblem.xsd.test.messages package. 
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

    private final static QName _RequestMessage_QNAME = new QName("http://www.wsdlgetproblem.org/xsd/test/messages", "requestMessage");
    private final static QName _ResponseMessage_QNAME = new QName("http://www.wsdlgetproblem.org/xsd/test/messages", "responseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.wsdlgetproblem.xsd.test.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsdlgetproblem.org/xsd/test/messages", name = "requestMessage")
    public JAXBElement<CommonRequestType> createRequestMessage(CommonRequestType value) {
        return new JAXBElement<CommonRequestType>(_RequestMessage_QNAME, CommonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsdlgetproblem.org/xsd/test/messages", name = "responseMessage")
    public JAXBElement<String> createResponseMessage(String value) {
        return new JAXBElement<String>(_ResponseMessage_QNAME, String.class, null, value);
    }

}
