package org.hb0712.learn.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class FirseJson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject me = new JSONObject();
		me.put("name", "xieyang");
		me.put("sex", "male");

		JSONArray education = new JSONArray();
		education.put("lslss");

		me.put("education", education);

		System.out.print(me.toString());
		

	}
}
