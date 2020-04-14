package com.adarsh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.io.File;

/*
Service Url
http://localhost:8080/JaxRsDownloadImageFile/service/image/get
*/

@Path("/service/image")
public class ImageService {

    private static final String FILE_PATH = "c:\\god.jpg";
    private static final String FILE = "god.jpg";

    @GET
    @Path("/get")
    @Produces("image/jpeg")
    public Response getFile() {

        File file = new File(FILE_PATH);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=" + FILE);
        return response.build();

    }

}