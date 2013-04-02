package org.hb0712.learn.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class JsonSample {
	private String PATH = System.getProperty("user.dir")+"\\test\\org\\hb0712\\learn\\json\\guopan.xml";
	public JSONObject message;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonSample json = new JsonSample();
		try {
			json.test0();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		json.test1();
		
		System.out.println(json.message);
	}
	
	public void test0() throws IOException{
		File file = new File(PATH);
		BufferedReader o = new BufferedReader(new FileReader(file));
		int re ;
		StringBuffer sb = new StringBuffer();
		while((re = o.read())>0){
			sb.append((char) re);
		}
		JSONObject job = XML.toJSONObject(sb.toString());
		
		message = job.getJSONObject("message");
	}
	
	/*
	 * ursLoginLogStatistic  的兼容处理
	 */
	public void test1(){
		System.out.println(message.optInt("ursLoginLogStatistic"));
		JSONArray c = message.optJSONArray("ursLoginLogStatistic");
		if(c==null){
			c = new JSONArray();
			c.put(message.getJSONObject("ursLoginLogStatistic"));
		}
		
		JSONArray newtype = new JSONArray();
		for(int i=0;i<c.length();i++){
			String[] hang = new String[5];
			hang[0] = c.getJSONObject(i).getString("area");
			hang[1] = String.valueOf(c.getJSONObject(i).optInt("days"));
			hang[2] = String.valueOf(c.getJSONObject(i).optInt("logins"));
			hang[3] = c.getJSONObject(i).getString("firstTime");
			hang[4] = c.getJSONObject(i).getString("lastTime");
			
			newtype.put(hang);
		}
		message.remove("ursLoginLogStatistic");
		message.put("ursLoginLogStatistic", newtype);
	}
	
	/*
	 * queryHistorySecureInfo
	 * 没数据
	 */
	public void test2(){
		
	}
	
	/*
	 * mailInfo 
	 * 没做
	 */
	public void test3(){
		
	}
	
	/*
	 * queryUserMobInfo 
	 */
	public void test4(){
		
	}

}
