package org.hb0712.http;

import java.util.Map;

import org.hb0712.http.client.BaiduHttpClient;
import org.hb0712.http.client.UrsHttpClient;
import org.junit.Test;

public class ClientTest {
	@Test
	public void test(){
		HttpClient uhc = new UrsHttpClient(new Parser1());

		Map<String, String> r = uhc.getDate("http://www.baidu.com");
		System.out.println(r);
		
		HttpClient bhc = new BaiduHttpClient();
		
		Map<String, String> bg = bhc.getDate("http://www.baidu.com");
		System.out.println(bg);
	}
}
