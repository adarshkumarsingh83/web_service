package com.adarsh.jaxws.endpoint;
 
import javax.xml.ws.Endpoint;
import com.adarsh.jaxws.ws.UserProfileImpl;
 
//Endpoint publisher
public class WsPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9090/user", new UserProfileImpl());
    }
 
}