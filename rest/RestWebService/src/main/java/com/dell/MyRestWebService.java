package com.dell;

import javax.ws.rs.*;
import java.util.Locale;
import java.util.Calendar;
import javax.jws.WebService;
import org.springframework.stereotype.Service;
import org.springframework.format.datetime.DateFormatter;

@WebService
@Service("myRestWebService")
public class MyRestWebService {

             @GET
             @Path("/get")
             @Produces("text/plain")
             public String getGetData(){
                System.out.println("MyRestWebService :  getGetData()");
                return "MyRestWebService :  getGetData()"+this._getServerDate();
            }

            @POST
            @Path("/post")
            @Produces("text/plain")
            public String getPostData(){
                   System.out.println("MyRestWebService :  getPostData()");
                 return "MyRestWebService :  getPostData()"+this._getServerDate();
            }

            @PUT
            @Path("/put")
            @Produces("text/plain")
            public String getPutData(){
                   System.out.println("MyRestWebService :  getPutData()");
                 return "MyRestWebService :  getPutData()"+this._getServerDate();
            }


            @DELETE
            @Path("/delete")
            @Produces("text/plain")
            public String getDeleteData(){
                   System.out.println("MyRestWebService :  getDeleteData()");
                 return "MyRestWebService :  getDeleteData()"+this._getServerDate();
            }

            @HEAD
            @Path("/head")
            @Produces("text/plain")
            public String getHeadeData(){
                   System.out.println("MyRestWebService :  getHeadeData()");
                 return "MyRestWebService :  getHeadeData()"+this._getServerDate();
            }

            @OPTIONS
            @Path("/option")
            @Produces("text/plain")
            public String getOptionData(){
                   System.out.println("MyRestWebService :  getOptionData()");
                 return "MyRestWebService :  getOptionData()"+this._getServerDate();
            }


           private String _getServerDate(){
                DateFormatter formatter = new DateFormatter("dd/MM/yyyy");
                return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
           }
}

