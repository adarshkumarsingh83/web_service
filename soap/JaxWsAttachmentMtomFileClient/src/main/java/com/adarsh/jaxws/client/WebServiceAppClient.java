package com.adarsh.jaxws.client;

import com.adarsh.jaxws.service.JaxWsFileServer;
import com.adarsh.jaxws.service.JaxWsFileServerImplService;

import javax.xml.ws.soap.MTOMFeature;
import java.io.*;

public class WebServiceAppClient {

    public static void main(String[] args) {
        JaxWsFileServerImplService service = new JaxWsFileServerImplService();
        JaxWsFileServer port = service.getJaxWsFileServerImplPort(new MTOMFeature(10240));
        uploadFile(port);
        //downloadFile(port);
    }

    public static void uploadFile(JaxWsFileServer port){
        final String filePath = "D:\\Server\\samplefiletoupload.txt";
        File file = new File(filePath);
        // uploads a file
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);

            port.uploadFile(file.getName(), bytes);

            inputStream.close();
            System.out.println("File uploaded: " + filePath);
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static void downloadFile(JaxWsFileServer port){
        // downloads another file
        final String filePath = "D:\\Server\\Download\\samplefiledownload.txt";
        byte[] fileBytes = port.download("samplefiletoupload.txt");
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            outputStream.write(fileBytes);
            outputStream.close();
            System.out.println("File downloaded: " + filePath);
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

}
