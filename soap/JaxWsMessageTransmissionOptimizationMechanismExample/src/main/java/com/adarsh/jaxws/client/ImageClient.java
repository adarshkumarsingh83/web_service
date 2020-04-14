package com.adarsh.jaxws.client;

import com.adarsh.jaxws.ws.ImageServer;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class ImageClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/JaxWsMessageTransmissionOptimizationMechanismExample/image?wsdl");
        QName qname = new QName("http://ws.jaxws.adarsh.com/", "ImageServerImplService");
        Service service = Service.create(url, qname);
        ImageServer imageServer = service.getPort(ImageServer.class);
        uploadImage(imageServer);
        downloadImage(imageServer);
    }

    public static void uploadImage(ImageServer imageServer) throws Exception {
        /************  test upload ****************/
        Image imgUpload = ImageIO.read(new File("D:\\images\\server\\rss.png"));
        //enable MTOM in client
        BindingProvider bp = (BindingProvider) imageServer;
        SOAPBinding binding = (SOAPBinding) bp.getBinding();
        binding.setMTOMEnabled(true);
        String status = imageServer.uploadImage(imgUpload);
        System.out.println("imageServer.uploadImage() : " + status);
    }

    public static void downloadImage(ImageServer imageServer) throws Exception {
        /************  test download  ***************/
        Image image = imageServer.downloadImage("server\\rss.png");
        //display it in frame
        BufferedImage bufferedImage = (BufferedImage) image;
        File imageFile = new File("d:\\images\\rssDownload.png");
        ImageIO.write(bufferedImage, "png", imageFile);
        System.out.println("imageServer.downloadImage() : Download Successful!");
    }

}