package com.adarsh.jaxws.endpoint;
 
import javax.xml.ws.Endpoint;

import com.adarsh.jaxws.ws.HelloWorldImpl;
import com.adarsh.jaxws.ws.HelloWorldImpl;

public class HelloWorldPublisher{
 
	public static void main(String[] args) {

	   Endpoint.publish("http://localhost:8080/JaxWsDocumentExample/hello", new HelloWorldImpl());
    }
 
}