package com.adarsh.http.rest;

import com.adarsh.http.FileUploadClient;
import com.adarsh.http.FileUploadClientImpl;
import org.junit.Test;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class UploadRestServiceClient {

    protected final static FileUploadClient FILE_UPLOAD_CLIENT = new FileUploadClientImpl();

    @Test
    public void uploadFileToServer() throws Exception {
        final String restServiceUrl = "http://localhost:8080/SpringJaxRsDownloadApplication/rest/postService/fileUpload";
        final String uploadFilePath = "D:\\Oracle Technology Network.docx";
        String result = FILE_UPLOAD_CLIENT.uploadFileClient(restServiceUrl, uploadFilePath);
        System.out.println(result);

    }
}
