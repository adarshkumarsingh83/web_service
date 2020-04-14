package com.adarsh.rest.service;

import com.adarsh.rest.domain.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JSONService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public Product getProductInJSON() {

        Product product = new Product();
        product.setName("bmw ");
        product.setQty(999);

        return product;

    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON(Product product) {

        String result = "Product created : " + product;
        return Response.status(201).entity(result).build();

    }

}