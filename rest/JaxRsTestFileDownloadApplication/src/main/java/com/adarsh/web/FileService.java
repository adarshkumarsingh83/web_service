package com.adarsh.web;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/file")
public class FileService {

    private static final String FILE_PATH_PLAN = "sample.log";
    private static final String FILE_PATH_EXCEL = "sample.xls";
    private static final String FILE_PATH_WORD = "sample.doc";
    private static final String FILE_PATH_PPT = "sample.ppt";

    //http://localhost:8080/JaxRsTestFileDownloadApplication/rest/file/get/logFile
    @GET
    @Path("/get/logFile")
    @Produces("text/plain")
    public Response getLogFile() {
        File file = new File(FILE_PATH_PLAN);
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=\"file_from_server.log\"");
        return response.build();
    }

    //http://localhost:8080/JaxRsTestFileDownloadApplication/rest/file/get/getTextFile
    @GET
    @Path("/get/logFile")
    @Produces("text/plain")
    public Response getTextFile() {
        File file = new File(FILE_PATH_PLAN);
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=\"file_from_server.txt\"");
        return response.build();
    }


    //http://localhost:8080/JaxRsTestFileDownloadApplication/rest/file/get/excelFile
    @GET
    @Path("/get/excelFile")
    @Produces("application/vnd.ms-excel")
    public Response getExcelFile() {
        File file = new File(FILE_PATH_EXCEL);
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=\"file_from_server.xls\"");
        return response.build();
    }


    //http://localhost:8080/JaxRsTestFileDownloadApplication/rest/file/get/wordFile
    @GET
    @Path("/get/wordFile")
    @Produces("application/vnd.ms-doc")
    public Response getWordFile() {
        File file = new File(FILE_PATH_WORD);
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=\"file_from_server.doc\"");
        return response.build();
    }


    //http://localhost:8080/JaxRsTestFileDownloadApplication/rest/file/get/pptFile
    @GET
    @Path("/get/pptFile")
    @Produces("application/vnd.ms-ppt")
    public Response getPptFile() {
        File file = new File(FILE_PATH_PPT);
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=\"file_from_server.ppt\"");
        return response.build();
    }

}