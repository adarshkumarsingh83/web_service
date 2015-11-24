package com.adarsh.web;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/image")
public class ImageService {

	private static final String FILE_PATH_PNG = "c:\\mkyong-logo.png";
	private static final String FILE_PATH_JPG = "c:\\mkyong-logo.jpg";
	private static final String FILE_PATH_JPEG = "c:\\mkyong-logo.jpeg";

	@GET
	@Path("/get/png")
	@Produces("image/png")
	public Response getPngFile() {

		File file = new File(FILE_PATH_PNG);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=image_from_server.png");
		return response.build();
	}

    @GET
    @Path("/get/jpg")
    @Produces("image/jpg")
    public Response getJpgFile() {

        File file = new File(FILE_PATH_JPG);

        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=image_from_server.jpg");
        return response.build();

    }


    @GET
    @Path("/get/jpeg")
    @Produces("image/jpeg")
    public Response getJpegFile() {
        File file = new File(FILE_PATH_JPEG);
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
                "attachment; filename=image_from_server.jpeg");
        return response.build();
    }

}