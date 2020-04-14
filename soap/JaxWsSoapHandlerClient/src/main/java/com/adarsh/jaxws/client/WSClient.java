package com.adarsh.jaxws.client;


import com.adarsh.jaxws.ws.MyMessageWebService;
import com.adarsh.jaxws.ws.MyMessageWebServiceImplService;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/2/14
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class WSClient {

    public static void main(String[] args) {

        MyMessageWebServiceImplService webService = new MyMessageWebServiceImplService();
        MyMessageWebService serviceInterface = webService.getMyMessageWebServiceImplPort();
        System.out.println(serviceInterface.printMessage());
    }
}
