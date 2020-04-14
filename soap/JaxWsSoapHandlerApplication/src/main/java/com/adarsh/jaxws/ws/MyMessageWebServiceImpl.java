package com.adarsh.jaxws.ws;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "com.adarsh.jaxws.ws.MyMessageWebService")
@HandlerChain(file="handlers.xml")
public class MyMessageWebServiceImpl implements MyMessageWebService {

    @Override
    public String printMessage() {
        return "Hello from Adarsh Server";
    }
}
