package org.hb0712.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class CURL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = CURL.getxx("http://www.baidu.com");

		System.out.println(s);
	}
	
	private static InputStream get(String u) throws IOException{
		Resource resource = new UrlResource(u);
		return resource.getInputStream();
	}
	
	
	private static String get(InputStream is) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		StringBuffer sb = new StringBuffer();
		int s;
		while((s = br.read()) != -1){
			sb.append((char) s);
		}
		
		return sb.toString();
	}
	
	public static String getxx(String s){
		String p = null;
		try {
			InputStream is = CURL.get(s);
			p = CURL.get(is);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public static String getxxx(String key){
		
		return null;
	}

}
