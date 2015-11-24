
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

    private final static QName _Destroy_QNAME = new QName("http://ws.jaxws.adarsh.com/", "destroy");
    private final static QName _GetIpAddressResponse_QNAME = new QName("http://ws.jaxws.adarsh.com/", "getIpAddressResponse");
    private final static QName _Init_QNAME = new QName("http://ws.jaxws.adarsh.com/", "init");
    private final static QName _DestroyResponse_QNAME = new QName("http://ws.jaxws.adarsh.com/", "destroyResponse");
    private final static QName _GetIpAddress_QNAME = new QName("http://ws.jaxws.adarsh.com/", "getIpAddress");
    private final static QName _InitResponse_QNAME = new QName("http://ws.jaxws.adarsh.com/", "initResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adarsh.jaxws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Destroy }
     * 
     */
    public Destroy createDestroy() {
        return new Destroy();
    }

    /**
     * Create an instance of {@link GetIpAddressResponse }
     * 
     */
    public GetIpAddressResponse createGetIpAddressResponse() {
        return new GetIpAddressResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link GetIpAddress }
     * 
     */
    public GetIpAddress createGetIpAddress() {
        return new GetIpAddress();
    }

    /**
     * Create an instance of {@link DestroyResponse }
     * 
     */
    public DestroyResponse createDestroyResponse() {
        return new DestroyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destroy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "destroy")
    public JAXBElement<Destroy> createDestroy(Destroy value) {
        return new JAXBElement<Destroy>(_Destroy_QNAME, Destroy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "getIpAddressResponse")
    public JAXBElement<GetIpAddressResponse> createGetIpAddressResponse(GetIpAddressResponse value) {
        return new JAXBElement<GetIpAddressResponse>(_GetIpAddressResponse_QNAME, GetIpAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestroyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "destroyResponse")
    public JAXBElement<DestroyResponse> createDestroyResponse(DestroyResponse value) {
        return new JAXBElement<DestroyResponse>(_DestroyResponse_QNAME, DestroyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "getIpAddress")
    public JAXBElement<GetIpAddress> createGetIpAddress(GetIpAddress value) {
        return new JAXBElement<GetIpAddress>(_GetIpAddress_QNAME, GetIpAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.adarsh.com/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

}
