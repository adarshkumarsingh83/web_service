package com.adarsh.jaxws.publisher;

import com.adarsh.jaxws.service.JaxWsFileServerImpl;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/2/14
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class JaxWsFileServicePublisher {

    public static void main(String[] args) {
        String bindingURI = "http://localhost:8080/JaxWsAttachmentMtomFileExample/fileService";
        JaxWsFileServerImpl jaxWsFileServer = new JaxWsFileServerImpl();
        Endpoint.publish(bindingURI, jaxWsFileServer);
        System.out.println("Server started at: " + bindingURI);
    }

}
