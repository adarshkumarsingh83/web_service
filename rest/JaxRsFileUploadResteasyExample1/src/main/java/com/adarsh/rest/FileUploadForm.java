package com.adarsh.rest;

import javax.ws.rs.FormParam;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class FileUploadForm {

	public FileUploadForm() {
	}
	
	private byte[] data;

	public byte[] getData() {
		return data;
	}

	@FormParam("file")
	public void setData(byte[] data) {
		this.data = data;
	}

	
}