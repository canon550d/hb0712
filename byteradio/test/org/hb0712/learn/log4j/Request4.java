package org.hb0712.learn.log4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.BaseElement;

public class Request4 {
	private String PATH = System.getProperty("user.dir")+"\\test\\org\\hb0712\\learn\\log4j\\message.xml";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Request4().test();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test() throws DocumentException, IOException{
		File myFile = new File(PATH);
		Document document = null;
		if (myFile.exists()){
			SAXReader reader = new SAXReader();
			document = reader.read(new File(PATH));
		}else{
			document = DocumentHelper.createDocument();
		}
		Element root = document.getRootElement();
//		this.queryIUserInfo(root);
		root.add(cao());
		System.out.println(root.asXML());
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileOutputStream(PATH), format);
		writer.write(document);
		writer.close();
	}
	
	/*
	 * 持久化账户信息
	 */
	public boolean queryIUserInfo(Element root){
		Element message = root.element("queryIUserInfo");
		if(message == null){
			message = root.addElement("queryIUserInfo");
			message.addElement("lastLoginIp").addText("218.107.55.253 广东省,广州市,联通");
			message.addElement("ssn").addText("guopan0518");
			message.addElement("ursBirthday").addText("1988-03-01");
			message.addElement("qqNumber").addText("824229329");
			message.addElement("lastLoginPdt").addText("flashmail");
			message.addElement("baomiEmail").addText("guopan0518@126.com");
			message.addElement("regTime").addText("2010-07-26 21:19:57.0");
			message.addElement("lastLoginTime").addText("2012-08-03 12:42:19.0");
			message.addElement("name").addText("郭攀");
		}
		return false;
	}
	
	public Element cao(){
		Element e = new BaseElement("fuck");
		e.addElement("name").addAttribute("doAt", "16:00").addText("jack");
		System.out.println(e.asXML());
		return e;
	}

}
