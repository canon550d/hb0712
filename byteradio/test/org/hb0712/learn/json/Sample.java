package org.hb0712.learn.json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample().test1();
	}

	/*
	 * ���ǹȸ��Gson���������������
	 */
	public void test1(){
		JsonObject jo = new JsonObject();
		jo.addProperty("name", "gulie");

		System.out.println(new Gson().toJson(jo).toString());
	}

}
