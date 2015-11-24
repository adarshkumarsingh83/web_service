package com.adarsh.jaxws.ws;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface MyMessageWebService {

    @WebMethod
    public String printMessage();

}
