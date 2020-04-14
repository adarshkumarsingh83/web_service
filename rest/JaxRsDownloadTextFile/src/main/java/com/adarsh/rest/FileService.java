package com.adarsh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.io.File;

/*
 Service Url
 http://localhost:8080/JaxRsDownloadTextFile/service/file/get
*/

@Path("/service/file")
public class FileService {

    private static final String FILE_PATH = "c:\\app.log";

    @GET
    @Path("/get")
    @Produces("text/plain")
    public Response getFile() {

        File file = new File(FILE_PATH);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=\"file_from_server.log\"");
        return response.build();

    }

}