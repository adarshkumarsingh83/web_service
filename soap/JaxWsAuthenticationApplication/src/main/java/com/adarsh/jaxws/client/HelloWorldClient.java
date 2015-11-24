package com.adarsh.jaxws.client;

import com.adarsh.jaxws.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorldClient {

    private static final String WS_URL = "http://localhost:9090/hello?wsdl";

    public static void main(String[] args) throws Exception {

        final URL url = new URL(WS_URL);

        //wsdl QName qname = new QName("targetNameSpace", "ServiceName");
        QName qname = new QName("http://ws.jaxws.adarsh.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);

        /*******************UserName & Password ******************************/
        Map<String, Object> req_ctx = ((BindingProvider) hello).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

        final Map<String, List<String>> headers = new HashMap<String, List<String>>() {
            {
                put("Username", Collections.singletonList("adarsh"));
                put("Password", Collections.singletonList("radha"));
            }
        };

        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        /**********************************************************************/
        System.out.println(hello.getHelloWorldAsString());

    }

}
