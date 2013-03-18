package org.hb0712.http.parser;

import java.io.InputStream;

public class GetIDNumServlet extends AbstractParse{
	private String name = "111";
	
	public GetIDNumServlet(Parse parse) {
		super(parse);
		// TODO Auto-generated constructor stub
	}

	public Tags action(InputStream is) {
		// TODO Auto-generated method stub
		Tags t = super.action(is);
		this.setGetIDNumServlet(t);
		return t;
	}
	
	public void setGetIDNumServlet(Tags t){
		System.out.println("tags.setGetIDNumServlet(getIDNumServlet);");
	}

}
