package com.adarsh.jaxws.ws;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//Service Implementation Bean
@MTOM
@WebService(endpointInterface = "com.adarsh.jaxws.ws.ImageServer")
public class ImageServerImpl implements ImageServer {

    @Override
    public Image downloadImage(String name) {

        try {
            File image = new File("d:\\images\\" + name);
            return ImageIO.read(image);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public String uploadImage(Image image) {

        if (image != null) {
            try {
                //store somewhere
                BufferedImage bufferedImage = (BufferedImage) image;
                File imageFile = new File("d:\\images\\rssUpload.png");
                ImageIO.write(bufferedImage, "png", imageFile);
                return "Upload Successful";
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            return "Upload UnSuccessful";
        }
        throw new WebServiceException("Upload Failed!");
    }

}