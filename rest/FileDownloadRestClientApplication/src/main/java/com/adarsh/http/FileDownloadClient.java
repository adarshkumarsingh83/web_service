package com.adarsh.http;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public interface FileDownloadClient {


    /**
     * fileDownloadGetRestCall() provide the specification for download the files
     * from the JAX-RS web service and storing it to supplied path in the location.
     * this method is for the HTTP GET protocol bind method in the web service
     *
     * @param url      accept the instance of the java.lang.String containing the url
     *                 for the JAX-RS based rest service.
     * @param filePath accept the instance of the java.lang.String containing the path
     *                 for the file to be downloaded in the local file system.
     * @return the instance of the java.io.File referencing to the the downloaded file
     *         from the rest web service.
     * @throws Exception when any abnormal situation
     *                   encountered during the
     *                   application execution
     */
    public File fileDownloadGetRestCall(final String url, final String filePath) throws Exception;

    /**
     * fileDownloadPostRestCall() provide the specification for download the files
     * from the JAX-RS web service and storing it to supplied path in the location.
     * this method is for the HTTP POST protocol bind method in the web service
     *
     * @param url              accept the instance of the java.lang.String containing the url
     *                         for the JAX-RS based rest service.
     * @param filePath         accept the instance of the java.lang.String containing the path
     *                         for the file to be downloaded in the local file system.
     * @param postRequestParam accept the instance of the java.util.Map containing the parameter
     *                         for the JAX-RS post web service.
     * @return the instance of the java.io.File referencing to the the downloaded file
     *         from the rest web service.
     * @throws Exception when any abnormal situation
     *                   encountered during the
     *                   application execution
     */
    public File fileDownloadPostRestCall(final String url, final String filePath
            , final Map<String, Object> postRequestParam) throws Exception;


    /**
     * getJsonDataFromServer()
     *
     *
     * @param url
     * @param data
     * @return
     * @throws Exception
     */
    public String getJsonDataFromServer(final String url,final String data) throws Exception;

    /**
     * postJsonDataFromServer()
     *
     *
     * @param url
     * @param data
     * @return
     * @throws Exception
     */
    public String postJsonDataFromServer(final String url,final String data) throws Exception;

    /**
     * getXmlDataFromServer()
     *
     *
     * @param url
     * @param data
     * @return
     * @throws Exception
     */
    public String getXmlDataFromServer(final String url,final String data) throws Exception;


    /**
     * postXmlDataFromServer()
     *
     *
     * @param url
     * @param data
     * @return
     * @throws Exception
     */
    public String postXmlDataFromServer(final String url, final String data) throws Exception;
}
