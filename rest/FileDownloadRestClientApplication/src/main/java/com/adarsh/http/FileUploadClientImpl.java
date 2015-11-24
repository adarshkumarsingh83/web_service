package com.adarsh.http;


import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.util.EntityUtils;
import sun.net.www.URLConnection;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;


/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class FileUploadClientImpl implements FileUploadClient {


    public String uploadFileClient(final String restServiceUrl, final String filePath) throws Exception {
        String result = null;
        try {

            HttpClient client = new DefaultHttpClient();
            client.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);

            HttpPost post = new HttpPost(restServiceUrl);
            MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);

            File file = new File(filePath);
            String mimeType = new MimetypesFileTypeMap().getContentType(file);
            entity.addPart("file", new FileBody(((File) file), mimeType));
            post.setEntity(entity);

            result = EntityUtils.toString(client.execute(post).getEntity(), "UTF-8");

            client.getConnectionManager().shutdown();

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
