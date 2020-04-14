package com.adarsh.http;

import com.sun.security.ntlm.Client;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class FileDownloadClientImpl implements FileDownloadClient {


    @Override
    public File fileDownloadGetRestCall(final String url, final String filePath) throws Exception {

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                File fileObject = new File(filePath);
                long length = entity.getContentLength();
                if (length > 0) {
                    InputStream inputStream = entity.getContent();
                    OutputStream outputStream = new FileOutputStream(fileObject);
                    IOUtils.copy(inputStream, outputStream);
                    outputStream.close();
                }
                return fileObject;
            }
        } else {
            throw new RuntimeException(response.getStatusLine().getStatusCode()
                    + " " + response.getStatusLine().getReasonPhrase());
        }
        return null;
    }

    @Override
    public File fileDownloadPostRestCall(final String url, final String filePath
            , final Map<String, Object> postRequestParam) throws Exception {
        HttpClient client = new DefaultHttpClient();
        HttpPost request = new HttpPost(url);
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(postRequestParam.size());
        for (Map.Entry<String, Object> entry : postRequestParam.entrySet()) {
            nameValuePairs.add(new BasicNameValuePair(entry.getKey(), "" + entry.getValue()));
        }
        request.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        HttpResponse response = client.execute(request);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                File fileObject = new File(filePath);
                long length = entity.getContentLength();
                if (length > 0) {
                    InputStream inputStream = entity.getContent();
                    OutputStream outputStream = new FileOutputStream(fileObject);
                    IOUtils.copy(inputStream, outputStream);
                    outputStream.close();
                }
                return fileObject;
            }
        } else {
            throw new RuntimeException(response.getStatusLine().getStatusCode()
                    + " " + response.getStatusLine().getReasonPhrase());
        }
        return null;
    }

    @Override
    public String getJsonDataFromServer(final String url, final String data) throws Exception {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet(url);
            getRequest.addHeader("accept", "application/json");
            getRequest.setParams(new BasicHttpParams().setParameter("data",data));
            HttpResponse response = httpClient.execute(getRequest);
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output;
            String result = "";
            while ((output = br.readLine()) != null) {
                result = result + output;
            }
            httpClient.getConnectionManager().shutdown();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String postJsonDataFromServer(String url, String data) throws Exception {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost(url);
            StringEntity input = new StringEntity(data);
            input.setContentType("application/json");
            postRequest.setEntity(input);
            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));
            String output;
            String result = "";
            while ((output = br.readLine()) != null) {
                result = result + output;
            }
            httpClient.getConnectionManager().shutdown();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getXmlDataFromServer(final String url, final String data) throws Exception {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet(url);
            getRequest.addHeader("accept", "application/json");
            HttpResponse response = httpClient.execute(getRequest);
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output;
            String result = "";
            while ((output = br.readLine()) != null) {
                result = result + output;
            }
            httpClient.getConnectionManager().shutdown();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String postXmlDataFromServer(final String url, final String data) throws Exception {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost(url);
            StringEntity input = new StringEntity(data);
            input.setContentType("application/json");
            postRequest.setEntity(input);
            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));
            String output;
            String result = "";
            while ((output = br.readLine()) != null) {
                result = result + output;
            }
            httpClient.getConnectionManager().shutdown();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
