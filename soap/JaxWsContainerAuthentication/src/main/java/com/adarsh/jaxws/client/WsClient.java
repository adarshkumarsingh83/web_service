package com.adarsh.jaxws.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import com.adarsh.jaxws.ws.UserProfile;

public class WsClient{
	
	private static final String WS_URL = "http://localhost:9090/user?wsdl";
		
	public static void main(String[] args) throws Exception {
	   
		URL url = new URL(WS_URL);
        QName qname = new QName("http://ws.jaxws.adarsh.com/", "UserProfileImplService");

        Service service = Service.create(url, qname);
        UserProfile port = service.getPort(UserProfile.class);
        
        //add username and password for container authentication
        BindingProvider bp = (BindingProvider) port;
        bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "adarsh");
        bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "radha");

        System.out.println(port.getUserName());
       
    }

}
