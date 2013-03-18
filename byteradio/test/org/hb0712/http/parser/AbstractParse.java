package org.hb0712.http.parser;

import java.io.InputStream;

public abstract class AbstractParse implements Parse{
	
	private Parse parse;
	private HttpClient httpClient;
	
	public AbstractParse(Parse parse){
		this.parse = parse;
	}

	public Tags action(InputStream is) {
		// TODO Auto-generated method stub
		return this.parse.action(is);
	}

	public HttpClient getHttpClient() {
		return httpClient;
	}

	public void setHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
	}

}
