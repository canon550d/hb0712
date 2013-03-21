package org.hb0712.http.parser.impl;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hb0712.http.parser.Parse;
import org.hb0712.http.parser.Tags;

public class CheckIsModifySecureInfo implements Parse{
	private String name = "111";

	public CheckIsModifySecureInfo() {
		
		// TODO Auto-generated constructor stub
	}

	public List<Map<String, String>> action(InputStream is) {
		// TODO Auto-generated method stub
//		List<Map<String, String>> t = super.action(is);
//		this.setCheckIsModifySecureInfo(t);
		return null;
	}

	private void setCheckIsModifySecureInfo(Tags t){
		Map<String, String> m = new HashMap<String, String>();
		//开始了
		m.put("xieyang", "wori");

		
		//结束了
		t.setCheckIsModifySecureInfo(m);
		System.out.println("tags.setCheckIsModifySecureInfo(checkIsModifySecureInfo);");
	}


}
