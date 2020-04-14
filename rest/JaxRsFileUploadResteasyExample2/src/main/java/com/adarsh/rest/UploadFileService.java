package com.adarsh.rest;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Path("/file")
public class UploadFileService {

    @POST
    @Path("/upload")
    @Consumes("multipart/form-data")
    public Response uploadFile(@MultipartForm FileUploadForm form) {

        String fileName = "d:\\god.jpeg";

        try {
            writeFile(form.getData(), fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
        return Response.status(200)
                .entity("uploadFile is called, Uploaded file name : " + fileName).build();
    }

    // save to somewhere
    private void writeFile(byte[] content, String filename) throws IOException {

        File file = new File(filename);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fop = new FileOutputStream(file);

        fop.write(content);
        fop.flush();
        fop.close();

    }
}