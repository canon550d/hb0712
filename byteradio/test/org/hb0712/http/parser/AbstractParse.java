package org.hb0712.http.parser;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public abstract class AbstractParse implements Parse{
	
	private Parse parse;
	private HttpClient httpClient;
	


	public List<Map<String, String>> action(InputStream is) {
		// TODO Auto-generated method stub
		return this.parse.action(is);
	}



}
