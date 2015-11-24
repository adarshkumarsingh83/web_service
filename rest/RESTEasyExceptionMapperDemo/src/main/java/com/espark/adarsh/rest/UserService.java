package com.espark.adarsh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.spi.validation.ValidateRequest;

import com.espark.adarsh.exception.MyApplicationException;

@Path("/rest")
public class UserService {
    @Path("/users/{id}")
    @GET
    @ValidateRequest
    public Response getUserBId(@PathParam("id") String id) throws MyApplicationException {
        //validate mandatory field
        if (id == null) {
            throw new MyApplicationException("id is not present in request !!");
        }
        //Validate proper format
        try {
            Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new MyApplicationException("id is not a number !!");
        }
        //Process the request
        return Response.ok().entity("User with ID " + id + " found !!").build();
    }
}
