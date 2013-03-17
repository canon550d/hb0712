package org.hb0712.http.client;

import java.io.InputStream;
import java.util.Map;

import org.hb0712.http.AbstractHttpClient;
import org.hb0712.http.Parser;



public class UrsHttpClient extends AbstractHttpClient{
	private Parser parser;
	
	public UrsHttpClient(Parser parser) {
		// TODO Auto-generated constructor stub
		this.parser = parser;
	}

	public Map<String, String> parse(InputStream is) {
		// TODO Auto-generated method stub
		//不着急，这里可以自己实现，也可以由第三方是实现
		return parser.execute(is);
	}

}
