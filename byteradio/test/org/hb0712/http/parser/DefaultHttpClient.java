package org.hb0712.http.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class DefaultHttpClient implements HttpClient {
	private Parse parse;

	public InputStream read(String url) throws IOException {
		// TODO Auto-generated method stub
		Resource resource = new UrlResource(url);
		return resource.getInputStream();
	}
	
	public List<Map<String, String>> read( ){
//		InputStream is = null;
//		try {
//			is = this.read(db.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		List<Map<String, String>> s = this.parse.action(is);
		return null;
	}

}
