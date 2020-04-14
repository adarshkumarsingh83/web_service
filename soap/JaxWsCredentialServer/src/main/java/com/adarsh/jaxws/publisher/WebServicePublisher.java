package com.adarsh.jaxws.publisher;

import com.adarsh.jaxws.ws.MyAuthenticationServiceImpl;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/JaxWsCredentialServer/helloworld", new MyAuthenticationServiceImpl());
    }
}