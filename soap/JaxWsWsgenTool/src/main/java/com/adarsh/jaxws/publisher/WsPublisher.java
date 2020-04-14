package com.adarsh.jaxws.publisher;

import com.adarsh.jaxws.ws.ServerInfo;

import javax.xml.ws.Endpoint;


//Endpoint publisher
public class WsPublisher{

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/JaxWsWsgenTool/server", new ServerInfo());

        System.out.println("Service is published!");
    }

}