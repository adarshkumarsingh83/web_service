package com.adarsh.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld{
 
	@WebMethod(operationName="getHelloWorld")
	public String getHelloWorld(String name) {
		return "Hello World JAX-WS " + name;
	}
 
}