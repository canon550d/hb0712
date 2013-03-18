package org.hb0712.http.parser;

import java.io.InputStream;

public class MailInfo extends AbstractParse {

	public MailInfo(Parse parse) {
		super(parse);
		// TODO Auto-generated constructor stub
	}

	public Tags action(InputStream is) {
		// TODO Auto-generated method stub
		Tags t = super.action(is);
		this.setMailInfo(t);
		return t;
	}
	
	public void setMailInfo(Tags t){
		System.out.println("tags.setMailInfo(mailInfo);");
	}

}
