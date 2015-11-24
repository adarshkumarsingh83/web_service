package com.adarsh.jaxws.ws;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

//Service Implementation Bean
@WebService(endpointInterface = "com.adarsh.jaxws.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Resource
    private WebServiceContext webServiceContext;

    @Override
    public String getHelloWorldAsString() {

        final MessageContext messageContext = webServiceContext.getMessageContext();
        //get detail from request headers
        final Map http_headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        final List userList = (List) http_headers.get("Username");
        final List passList = (List) http_headers.get("Password");

        String username = "";
        String password = "";

        if (userList != null && !userList.isEmpty()) {
            //get username
            username = userList.get(0).toString();
        }

        if (passList != null && !userList.isEmpty()) {
            //get password
            password = passList.get(0).toString();
        }

        //Should validate username and password with database
        if (username.equals("adarsh") && password.equals("radha")) {
            return "Hello World JAX-WS - Valid User!";
        } else {
            return "Unknown User!";
        }
    }
}