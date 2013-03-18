package org.hb0712.http.parser;

import java.io.InputStream;

public class DefaultParse implements Parse {


	public Tags action(InputStream is) {
		// TODO Auto-generated method stub
		Tags t = new Tags();
		System.out.println("new Tags ，插入账号等额外信息，等待urs信息写入...");
		return t;
	}

}
