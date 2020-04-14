package com.adarsh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.io.File;

/*
 Service Url
http://localhost:8080/JaxRsDownloadPdfFile/service/pdf/get
*/

@Path("/service/pdf")
public class PdfService {

    private static final String FILE_PATH = "c:\\accountingconcepts.pdf";
    private static final String FILE = "accountingconcepts.pdf";

    @GET
    @Path("/get")
    @Produces("application/pdf")
    public Response getFile() {

        File file = new File(FILE_PATH);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=" + FILE);
        return response.build();

    }

}