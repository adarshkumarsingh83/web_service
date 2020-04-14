package com.adarsh.jaxws.client;

import com.adarsh.jaxws.ws.MyAuthenticationService;

import java.lang.Exception;import java.lang.String;import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

public class WebServiceClient {

    public static void main(String[] args) throws Exception {

        URL wsdlUrl = new URL("http://localhost:8080/JaxWsCredentialServer/helloworld?wsdl");

        //qualifier name ...
        QName qname = new QName("http://ws.jaxws.adarsh.com/", "MyAuthenticationServiceImplService");

        Service service = Service.create(wsdlUrl, qname);

        MyAuthenticationService sayHello = service.getPort(MyAuthenticationService.class);

        Map<String, Object> requestContext = ((BindingProvider)sayHello).getRequestContext();

        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/JaxWsCredentialServer/helloworld?wsdl");

        Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();

        requestHeaders.put("username", Collections.singletonList("adarsh"));
        requestHeaders.put("Password", Collections.singletonList("radha"));

        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

        System.out.println(sayHello.getHelloWorldAsString("- This is Java Code Geeks"));

    }
}
