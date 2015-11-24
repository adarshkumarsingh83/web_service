package com.adarsh.jaxws.handler;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class IpValidator implements SOAPHandler<SOAPMessageContext> {

    private final String VALID_ADDRESS = "192.168.1.4";

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println("Server::handleMessage() : ");
        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        // inbound message from client
        if (!isRequest) {

            try {
                SOAPMessage soapMsg = context.getMessage();
                SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
                SOAPHeader soapHeader = soapEnv.getHeader();

                // if no header, add one
                if (soapHeader == null) {
                    soapHeader = soapEnv.addHeader();
                    attacheErrorMessage(soapMsg, "No SOAP header");
                }

                // Get client mac address from SOAP header
                Iterator<?> it = soapHeader.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);

                // if no header block for next actor found? throw exception
                if (it == null || !it.hasNext()) {
                    attacheErrorMessage(soapMsg, "No header");
                }

                // if no ip address found? throw exception
                Node ipNode = (Node) it.next();
                String ipAddress = (ipNode == null) ? null : ipNode.getValue();

                if (ipAddress == null) {
                    attacheErrorMessage(soapMsg, "No IP address in header");
                }

                // at last, check if the ip address is trusted
                if (!ipAddress.equals(VALID_ADDRESS)) {
                    attacheErrorMessage(soapMsg, "Untrusted IP address");
                }
                // print soap message
                // you can log it as well
                soapMsg.writeTo(System.out);
            } catch (SOAPException e) {
                System.err.println(e);
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("Server::handleFault() : ");
        return true;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("Server::close() : ");
    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println("Server : getHeaders() : ");
        return null;
    }

    private void attacheErrorMessage(SOAPMessage errorMessage, String cause) {
        try {
            SOAPBody soapBody = errorMessage.getSOAPPart().getEnvelope().getBody();
            SOAPFault soapFault = soapBody.addFault();
            soapFault.setFaultString(cause);
            throw new SOAPFaultException(soapFault);
        } catch (SOAPException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}