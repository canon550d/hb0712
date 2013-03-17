package org.hb0712.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

/*
 * 一个抽象的http请求
 */
public abstract class AbstractHttpClient implements HttpClient{


	//模版方法
	protected abstract Map<String, String> parse(InputStream is);

	private InputStream getInputStream(String u) throws IOException{
		Resource resource = new UrlResource(u);
		return resource.getInputStream();
	}

	public Map<String, String> getDate(String url) {
		// TODO Auto-generated method stub
		InputStream is = null;
		try {
			is = this.getInputStream(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.parse(is);
	}

}
