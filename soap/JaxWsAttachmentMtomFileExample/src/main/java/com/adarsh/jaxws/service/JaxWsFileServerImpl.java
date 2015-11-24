package com.adarsh.jaxws.service;

import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;
import java.io.*;

//Service Implementation Bean
@MTOM(enabled = true, threshold = 10240)
@WebService(endpointInterface = "com.adarsh.jaxws.service.JaxWsFileServer")
public class JaxWsFileServerImpl implements JaxWsFileServer {

    @Override
    public byte[] download(String fileName) {
        final String filePath = "d:\\Server\\" + fileName;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] fileBytes = new byte[(int) file.length()];
            inputStream.read(fileBytes);
            inputStream.close();
            return fileBytes;
        } catch (IOException ex) {
            System.err.println(ex);
            throw new WebServiceException(ex);
        }
    }

    //for xml file javax.activation.DataHandler
    //for image file Image
    //for text file

    @Override
    public String uploadFile(String fileName, byte[] byteFileData) {
        String result = " ";
        final String filePath = "d:\\Server\\upload\\" + fileName;
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            outputStream.write(byteFileData);
            outputStream.close();
            System.out.println("Received file: " + filePath);
            result = "File Uploaded Successfully ";
        } catch (IOException ex) {
            result = "File Not Uploaded Successfully ";
            System.out.println(ex.getLocalizedMessage());
        }
        return result;
    }

}