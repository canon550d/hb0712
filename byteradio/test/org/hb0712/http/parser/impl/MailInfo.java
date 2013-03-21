package org.hb0712.http.parser.impl;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.hb0712.http.parser.AbstractParse;
import org.hb0712.http.parser.Parse;
import org.hb0712.http.parser.Tags;

public class MailInfo extends AbstractParse {



	public List<Map<String, String>> action(InputStream is) {
		// TODO Auto-generated method stub
		List<Map<String, String>> t = super.action(is);
//		this.setMailInfo(t);
		return t;
	}
	
	public void setMailInfo(Tags t){
		System.out.println("tags.setMailInfo(mailInfo);");
	}

}
