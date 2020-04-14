package com.adarsh.jaxws.handler;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Set;

public class IpInjector implements SOAPHandler<SOAPMessageContext> {


    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        System.out.println("Client::handleMessage()");

        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        // outbound message to server
        if (isRequest) {
            try {
                SOAPMessage soapMessage = context.getMessage();
                SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
                SOAPHeader soapHeader = soapEnvelope.getHeader();

                // add a header to the SOAP message
                if (soapHeader == null) {
                    soapHeader = soapEnvelope.addHeader();
                }

                // find out client's ip address
                InetAddress inAdd = InetAddress.getLocalHost();
                String ip = inAdd.getHostAddress();

                System.out.println("Client's ip address :" + ip);

                // add a soap header, name as "ipAddress"
                QName qname = new QName("http://ws.jaxws.adarsh.com/", "ipAddress");
                SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(qname);

                soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
                soapHeaderElement.addTextNode(ip);
                soapMessage.saveChanges();

                // print the message, or log it...
                soapMessage.writeTo(System.out);

            } catch (SOAPException e) {
                System.err.println(e);
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        // continue other handler chain
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("Client::handleFault() : ");
        return true;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("Client::close() : ");
    }

    @Override
    public Set getHeaders() {
        System.out.println("Client::getHeaders() : ");
        return null;
    }

}
