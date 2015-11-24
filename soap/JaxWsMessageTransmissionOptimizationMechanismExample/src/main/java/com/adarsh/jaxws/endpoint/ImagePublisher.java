package com.adarsh.jaxws.endpoint;

import javax.xml.ws.Endpoint;
import com.adarsh.jaxws.ws.ImageServerImpl;

//Endpoint publisher
public class ImagePublisher{
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/JaxWsMessageTransmissionOptimizationMechanismExample/image", new ImageServerImpl());
		
		System.out.println("Server is published!");
	   
    }

}
