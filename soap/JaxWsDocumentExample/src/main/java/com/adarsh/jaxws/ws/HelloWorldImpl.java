package com.adarsh.jaxws.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.adarsh.jaxws.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}