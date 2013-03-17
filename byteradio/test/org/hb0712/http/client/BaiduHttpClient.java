package org.hb0712.http.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.hb0712.http.AbstractHttpClient;

public class BaiduHttpClient extends AbstractHttpClient {


	public Map<String, String> parse(InputStream is) {
		// TODO Auto-generated method stub
		
		Map<String, String> m = new HashMap<String, String>();
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String s;
			int i = 1;
			while((s = br.readLine()) != null){
				m.put(String.valueOf(i) , s);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

}
