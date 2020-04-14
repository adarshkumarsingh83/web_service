package com.adarsh.spring.sws.ws;

import com.adarsh.spring.sws.beans.HelloWorldBo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWS {

    //DI via Spring
    HelloWorldBo helloWorldBo;

    @WebMethod(exclude = true)
    public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
        this.helloWorldBo = helloWorldBo;
    }

    @WebMethod(operationName = "getHelloWorld")
    public String getHelloWorld() {
        return helloWorldBo.getHelloWorld();
    }

}