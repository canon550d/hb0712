package org.hb0712.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Parser1 implements Parser {

	public Map<String, String> execute(InputStream is) {
		// TODO Auto-generated method stub
		BufferedReader br;
		try{
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		}catch(Exception e){
			
		}finally{
//			is.close();
		}
		Map<String, String> hm = new HashMap<String, String>();
		return hm;
	}

}
