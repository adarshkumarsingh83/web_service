package com.adarsh.jaxws.endpoint;
 
import javax.xml.ws.Endpoint;
import com.adarsh.jaxws.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9090/hello", new HelloWorldImpl());
    }
 
}