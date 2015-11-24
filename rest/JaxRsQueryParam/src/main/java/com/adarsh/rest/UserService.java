package com.adarsh.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/*
Service Url

http://localhost:8080/JaxRsQueryParam/users/query1?from=100&to=200&orderBy=age&orderBy=name

http://localhost:8080/JaxRsQueryParam/users/query2?from=100&to=200&orderBy=age&orderBy=name

*/

@Path("/users")
public class UserService {

    @GET
    @Path("/query1")
    public Response getUsers(@DefaultValue("1000") @QueryParam("from") int from,
                             @DefaultValue("999") @QueryParam("to") int to,
                             @DefaultValue("name") @QueryParam("orderBy") List<String> orderBy) {

        return Response
                .status(200)
                .entity("getUsers is called, from : " + from + ", to : " + to
                        + ", orderBy" + orderBy.toString()).build();

    }

    @GET
    @Path("/query2")
    public Response getUsers(@Context UriInfo info) {

        String from = info.getQueryParameters().getFirst("from");
        String to = info.getQueryParameters().getFirst("to");
        List<String> orderBy = info.getQueryParameters().get("orderBy");

        return Response
                .status(200)
                .entity("getUsers is called, from : " + from + ", to : " + to
                        + ", orderBy" + orderBy.toString()).build();

    }

}