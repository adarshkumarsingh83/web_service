package com.adarsh.jaxws.client;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.adarsh.jaxws.ws.HelloWorld;
import com.adarsh.jaxws.ws.HelloWorld;
 
public class HelloWorldClient{
 
	public static void main(String[] args) throws Exception {
 
		URL url = new URL("http://localhost:8080/JaxWsDocumentExample/hello?wsdl");
 
        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.jaxws.adarsh.com/", "HelloWorldImplService");
 
        Service service = Service.create(url, qname);
 
        HelloWorld hello = service.getPort(HelloWorld.class);
 
        System.out.println(hello.getHelloWorldAsString("adarsh"));
 
    }
 
}