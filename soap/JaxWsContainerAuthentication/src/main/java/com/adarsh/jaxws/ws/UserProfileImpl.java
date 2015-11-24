package com.adarsh.jaxws.ws;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.WebService;

@WebService(endpointInterface = "com.adarsh.jaxws.ws.UserProfile")
public class UserProfileImpl implements UserProfile{


    @PostConstruct
    public void init(){
        System.out.println("PostConstruct()");
    }

	@Override
	public String getUserName() {
		return "getUserName() : returned value";
	}

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy()");
    }

}