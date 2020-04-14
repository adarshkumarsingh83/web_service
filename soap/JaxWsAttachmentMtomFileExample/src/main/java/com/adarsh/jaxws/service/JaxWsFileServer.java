package com.adarsh.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.awt.*;
import java.io.File;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface JaxWsFileServer {


	
	//download a image from server
	@WebMethod
    public byte[] download(String fileName);
	
	//update image to server
	@WebMethod
    public String uploadFile(String fileName,byte[] byteFileData);
	
}