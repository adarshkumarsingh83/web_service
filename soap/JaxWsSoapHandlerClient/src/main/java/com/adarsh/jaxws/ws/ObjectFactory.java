
package com.adarsh.jaxws.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adarsh.jaxws.ws package. 
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

    private final static QName _PrintMessageResponse_QNAME = new QName("http://ws.jaxws.adarsh.com/", "printMessageResponse");
    private final static QName _PrintMessage_QNAME = new QName("http://ws.jaxws.adarsh.com/", "printMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adarsh.jaxws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintMessageResponse }
     * 
     */
    public PrintMessageResponse createPrintMessageResponse() {
        return new PrintMessageResponse();
    }

    /**
     * Create an instance of {@link PrintMessage }
     * 
     */
    public PrintMessage createPrintMessage() {
        return new PrintMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "printMessageResponse")
    public JAXBElement<PrintMessageResponse> createPrintMessageResponse(PrintMessageResponse value) {
        return new JAXBElement<PrintMessageResponse>(_PrintMessageResponse_QNAME, PrintMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "printMessage")
    public JAXBElement<PrintMessage> createPrintMessage(PrintMessage value) {
        return new JAXBElement<PrintMessage>(_PrintMessage_QNAME, PrintMessage.class, null, value);
    }

}
