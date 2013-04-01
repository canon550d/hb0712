package org.hb0712.learn.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.XML;

public class JsonSample {
	private String PATH = System.getProperty("user.dir")+"\\test\\org\\hb0712\\learn\\json\\guopan.xml";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new JsonSample().test1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test1() throws IOException{
		File file = new File(PATH);
		BufferedReader o = new BufferedReader(new FileReader(file));
		int re ;
		StringBuffer sb = new StringBuffer();
		while((re = o.read())>0){
			sb.append((char) re);
		}
		JSONObject job = XML.toJSONObject(sb.toString());
		System.out.println(job.get("message"));
	}

}
