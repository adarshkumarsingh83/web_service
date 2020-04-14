package com.adarsh.jaxws.ws;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerInfo {

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct");
    }

    @WebMethod
    public String getIpAddress() {
        return "10.10.10.10";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy");
    }

}