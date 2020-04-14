package com.adarsh.jaxws.publisher;

import com.adarsh.jaxws.ws.MyMessageWebServiceImpl;

import javax.xml.ws.Endpoint;

public class WebServicePublisher{

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/JaxWsSoapHandlerApplication/validator", new MyMessageWebServiceImpl());
        System.out.println("Web Service Publish");
    }
}