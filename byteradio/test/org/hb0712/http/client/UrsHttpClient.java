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
		//���ż�����������Լ�ʵ�֣�Ҳ�����ɵ�������ʵ��
		return parser.execute(is);
	}

}
