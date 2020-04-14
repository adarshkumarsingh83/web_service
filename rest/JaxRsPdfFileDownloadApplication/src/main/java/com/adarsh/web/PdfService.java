package com.adarsh.web;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/pdf")
public class PdfService {

	private static final String FILE_PATH_PDF = "sample.pdf";

    //http://localhost:8080/JaxRsPdfFileDownloadApplication/rest/pdf/get/pdfFile
	@GET
	@Path("/get/pdfFile")
	@Produces("application/pdf")
	public Response getFile() {

		File file = new File(FILE_PATH_PDF);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=server-file.pdf");
		return response.build();

	}

}