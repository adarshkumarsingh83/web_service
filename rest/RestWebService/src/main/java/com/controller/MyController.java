package com.controller;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Adarsh
 * Date: 2/14/12
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        final String serviceStatusMsg="<center> WEB SERVICE STARTED ...<br><br>"+
                " http://localhost:8080/sample/rest/get<br>"+
                " http://localhost:8080/sample/rest/post<br>"+
                " http://localhost:8080/sample/rest/put<br>"+
                " http://localhost:8080/sample/rest/delete<br>"+
                " http://localhost:8080/sample/rest/option<br>"+
                " http://localhost:8080/sample/rest/trace </center>";
       return new ModelAndView("resultPage","resultMessage",serviceStatusMsg);
    }
}
