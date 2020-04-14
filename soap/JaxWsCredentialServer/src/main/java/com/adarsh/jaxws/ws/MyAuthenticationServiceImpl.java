package com.adarsh.jaxws.ws;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "com.adarsh.jaxws.ws.MyAuthenticationService")
public class MyAuthenticationServiceImpl implements MyAuthenticationService {

    @Resource
    WebServiceContext webServiceContext;

    @Override
    public String getHelloWorldAsString(String str) {

        MessageContext messageContext = webServiceContext.getMessageContext();

        // get request headers
        Map<?, ?> requestHeaders = (Map<?, ?>) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List<?> usernameList = (List<?>) requestHeaders.get("username");
        List<?> passwordList = (List<?>) requestHeaders.get("password");
        String username = "";
        String password = "";

        if (usernameList != null) {
            username = usernameList.get(0).toString();
        }
        if (passwordList != null) {
            password = passwordList.get(0).toString();
        }
        // of course this is not real validation
        // you should validate your users from stored databases credentials
        if (username.equals("adarsh") && password.equals("radha")) {
            return "Valid User :" + str;
        } else {
            return "Unknown User!";
        }
    }
}
