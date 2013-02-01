package org.hb0712.http.impl.client;

import java.io.IOException;

import org.hb0712.http.HttpEntity;
import org.hb0712.http.HttpResponse;
import org.hb0712.http.client.methods.HttpGet;
import org.hb0712.http.util.EntityUtils;
import org.junit.Test;

public class AbstractHttpClientTest {

	@Test
	public void test() throws IOException {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://www.baidu.com");
		HttpResponse response1 = httpclient.execute(httpGet);
		
        // The underlying HTTP connection is still held by the response object 
        // to allow the response content to be streamed directly from the network socket. 
        // In order to ensure correct deallocation of system resources 
        // the user MUST either fully consume the response content  or abort request 
        // execution by calling HttpGet#releaseConnection().
		
        try {
            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
            EntityUtils.consume(entity1);
        } finally {
            httpGet.releaseConnection();
        }
	}

}
