package com.adarsh.rest;

import com.adarsh.domain.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/*
 Service Url
 http://localhost:8080/JaxRsDownloadXmlJaxbExample/service/xml/user/get

 */

@Path("/service/xml/user")
public class XMLService {

    @GET
    @Path("/get")
    @Produces("application/xml")
    public User getUserInXML() {

        User user = new User();
        user.setUsername("adarsh kumar");
        user.setPassword("radha singh");
        user.setPin(11223344);

        return user;

    }

}