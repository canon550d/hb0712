package org.hb0712.http.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class CheckIsModifySecureInfo extends AbstractParse{
	private String name = "111";

	public CheckIsModifySecureInfo(Parse parse) {
		super(parse);
		// TODO Auto-generated constructor stub
	}

	public Tags action(InputStream is) {
		// TODO Auto-generated method stub
		Tags t = super.action(is);
		this.setCheckIsModifySecureInfo(t);
		return t;
	}

	private void setCheckIsModifySecureInfo(Tags t){
		Map<String, String> m = new HashMap<String, String>();
		//开始了
		m.put("xieyang", "wori");
		try {
			this.getHttpClient().read("http://www.baidu.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//结束了
		t.setCheckIsModifySecureInfo(m);
		System.out.println("tags.setCheckIsModifySecureInfo(checkIsModifySecureInfo);");
	}


}
