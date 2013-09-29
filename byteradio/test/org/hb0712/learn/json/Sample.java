package org.hb0712.learn.json;

import org.json.JSONObject;
import org.json.XML;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample().test2();
	}

	/*
	 * 这是谷歌的Gson，可以用这个东西
	 */
	public void test1(){
//		JsonObject jo = new JsonObject();
//		jo.addProperty("name", "gulie");
//
//		System.out.println(new Gson().toJson(jo).toString());
	}

	public void test2(){

		Shop shop = new Shop();
		shop.setName("wanglong");
		String[] kso = new String[]{"2222","dddd"};
		shop.setBuy(kso);
		
		JSONObject jo = new JSONObject(shop);
		System.out.println(jo.toString());
		
		XML xml = new XML();
		System.out.println(xml.toString(jo));
	}
}
