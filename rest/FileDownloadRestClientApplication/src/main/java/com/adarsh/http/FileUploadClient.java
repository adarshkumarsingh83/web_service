package com.adarsh.http;

import java.io.File;
import java.util.Map;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public interface FileUploadClient {

    /**
     *  uploadFileClient()
     *
     * @param restServiceUrl
     * @param filePath
     * @return
     * @throws Exception
     */
    public String uploadFileClient(final String restServiceUrl, final String filePath) throws Exception;

}
