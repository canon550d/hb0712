package org.hb0712.http.parser;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class DefaultHttpClient implements HttpClient {

	public InputStream read(String url) throws IOException {
		// TODO Auto-generated method stub
		Resource resource = new UrlResource(url);
		return resource.getInputStream();
	}

}
