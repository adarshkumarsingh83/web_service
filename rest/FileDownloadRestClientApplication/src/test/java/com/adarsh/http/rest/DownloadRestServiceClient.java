package com.adarsh.http.rest;

import com.adarsh.http.FileDownloadClient;
import com.adarsh.http.FileDownloadClientImpl;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class DownloadRestServiceClient {

    private static final FileDownloadClient FILE_DOWNLOAD_CLIENT = new FileDownloadClientImpl();

    private static final Map mapJson = new HashMap();
    private static final Map mapXml = new HashMap();


    @Before
    public void init() {
        mapJson.put("name1", "sonu");
        mapJson.put("name2", "monu");
        mapXml.put("name1", "sonu");
        mapXml.put("name2", "monu");

    }

    /**
     * LOG FILE DOWNLOAD FROM SERVER
     */
    @Test
    public void getMethodTestLogFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.log";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getLogFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestLogFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.log";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postLogFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }


    /**
     * PDF FILE DOWNLOAD FROM SERVER
     */

    @Test
    public void getMethodTestPdfFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.pdf";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getPdfFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestPdfFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.pdf";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postPdfFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }


    /**
     * TXT FILE DOWNLOAD FROM SERVER
     */

    @Test
    public void getMethodTestTxtFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.txt";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getTxtFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestTxtFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.txt";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postTxtFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }


    /**
     * MS-WORD FILE DOWNLOAD FROM SERVER
     */

    @Test
    public void getMethodTestMsWordFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.doc";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getWordFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestMsWordFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.doc";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postWordFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }


    /**
     * MS-EXCEL FILE DOWNLOAD FROM SERVER
     */

    @Test
    public void getMethodTestMsExcelFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.xls";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getExcelFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestMsExcelFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.xls";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postExcelFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }

    /**
     * MS-PPT FILE DOWNLOAD FROM SERVER
     */

    @Test
    public void getMethodTestMsPptFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.ppt";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getPptFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestMsPptFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.ppt";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postPptFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }


    /**
     * ZIP FILE DOWNLOAD FROM SERVER
     */

    @Test
    public void getMethodTestZipFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "GetLocalSample.zip";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getFileDownload/getZipFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadGetRestCall(restServiceUrl, filePath);
        System.out.println(fileObject.getAbsoluteFile());
    }

    @Test
    public void postMethodTestZipFileDownload() throws Exception {
        String filePath = "D:\\RestDownlaod" + File.separator + "PostLocalSample.zip";
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postFileDownload/postZipFile";
        File fileObject = FILE_DOWNLOAD_CLIENT.fileDownloadPostRestCall(restServiceUrl, filePath, new HashMap<String, Object>());
        System.out.println(fileObject.getAbsoluteFile());
    }


    /**
     * JSON DATA FROM SERVER
     */


    @Test
    public void getMethodTestDataDownload() throws Exception {
        Gson gson = new Gson();
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getDataDownload/getJsonData";
        String data = FILE_DOWNLOAD_CLIENT.getJsonDataFromServer(restServiceUrl, gson.toJson(mapJson));
        Map resultMap = gson.fromJson(data, java.util.Map.class);
        System.out.println(resultMap);
    }

    @Test
    public void postMethodTestDataDownload() throws Exception {
        Gson gson = new Gson();
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postDataDownload/postJsonData";
        String data = FILE_DOWNLOAD_CLIENT.postJsonDataFromServer(restServiceUrl, gson.toJson(mapJson));
        Map resultMap = gson.fromJson(data, java.util.Map.class);
        System.out.println(resultMap);
    }


    /**
     * JSON DATA FROM SERVER
     */


    @Test
    public void getMethodTestXmlDownload() throws Exception {
        Gson gson = new Gson();
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/getDataDownload/getXmlData";
        String data = FILE_DOWNLOAD_CLIENT.getXmlDataFromServer(restServiceUrl, gson.toJson(mapXml));
        System.out.println(data);
    }

    @Test
    public void postMethodTestXmlDownload() throws Exception {
        Gson gson = new Gson();
        String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postDataDownload/postXmlData";
        String data = FILE_DOWNLOAD_CLIENT.postXmlDataFromServer(restServiceUrl, gson.toJson(mapXml));
        System.out.println(data);
    }
}
