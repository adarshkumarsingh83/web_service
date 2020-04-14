package com.adarsh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/*
Service Url

http://localhost:8080/JaxRsPathUriMatching/service/users/vip

http://localhost:8080/JaxRsPathUriMatching/service/users/adarsh

http://localhost:8080/JaxRsPathUriMatching/service/users/999

http://localhost:8080/JaxRsPathUriMatching/service/users/username/a9

http://localhost:8080/JaxRsPathUriMatching/service/users/books/999

*/

@Path("/service/users")
public class UserRestService {

    @GET
    public Response getUser() {
        return Response.status(200).entity("getUser is called").build();
    }

    @GET
    @Path("/vip")
    public Response getUserVIP() {
        return Response.status(200).entity("getUserVIP is called").build();
    }

    @GET
    @Path("{name}")
    public Response getUserByName(@PathParam("name") String name) {
        return Response.status(200)
                .entity("getUserByName is called, name : " + name).build();
    }

    @GET
    @Path("{id : \\d+}")
    public Response getUserById(@PathParam("id") String id) {
        return Response.status(200).entity("getUserById is called, id : " + id)
                .build();
    }

    @GET
    @Path("/username/{username : [a-zA-Z][a-zA-Z_0-9]}")
    public Response getUserByUserName(@PathParam("username") String username) {
        return Response.status(200)
                .entity("getUserByUserName is called, username : " + username)
                .build();
    }

    @GET
    @Path("/books/{isbn : \\d+}")
    public Response getUserBookByISBN(@PathParam("isbn") String isbn) {
        return Response.status(200)
                .entity("getUserBookByISBN is called, isbn : " + isbn).build();
    }

}