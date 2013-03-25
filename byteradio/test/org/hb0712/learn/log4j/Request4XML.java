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

public class Request4XML {
	private final String REQUEST = "request";
	private final String DESCRIBE ="describe";
	
	private String PATH = System.getProperty("user.dir")+"\\test\\org\\hb0712\\learn\\log4j\\message.xml";

	/**
	 * @param args
	 * @throws DocumentException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			new Request4XML().test();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * 
	 * 
	 * 新建电脑
	 */
	public String buildPath(){
		
		return null;
	}
	
	/*
	 * 以服务号获取文件
	 */
	public Document getDocument(String servNo) throws DocumentException{
		File myFile = new File(PATH);
		Document document = null;
		if (myFile.exists()){
			SAXReader reader = new SAXReader();
			document = reader.read(new File(PATH));
		}else{
			document = DocumentHelper.createDocument();
		}
		return document;
	}
	
	/*
	 * 这里是文件系统用的
	 */
	public boolean test() throws DocumentException, IOException{
		Document document = this.getDocument("123456");
		Element root = document.getRootElement();
		this.queryIUserInfo(root);
		this.queryUserMobInfo(root);
		this.queryIUserModifyLog(root);
		this.queryRegTimeAddr(root);
		this.queryHistorySecureInfo(root);
		this.ursLoginLogStatistic(root);
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileOutputStream(PATH), format);
		writer.write(document);
		writer.close();
		
		return false;
	}
	
	public boolean add(Element root){
		Element list = root.addElement(REQUEST)
			.addAttribute(DESCRIBE, "登录日志")
			.addText("湖北省武汉市")
			.addElement("list");
		list.addElement("登录地区")
			.addText("湖北省武汉市");
		
		list.addElement("时间跨度")
			.addText("20");
		return false;
	}

	public boolean ursLoginLogStatistic(Element root){
		Element message = root.element("ursLoginLogStatistic");
		if(message == null){
			message = root.addElement("ursLoginLogStatistic");
			for(int i=1;i<3;i++){
				Element list = message.addElement("log");
				list.addElement("area").addText("湖北省武汉市");
				list.addElement("days").addText("20");
				list.addElement("times").addText("10");
				list.addElement("start").addText("2012-08-16 22:17:56.0");
				list.addElement("end").addText("2012-07-27 01:24:06.0");
			}
		}
		return false;
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

	/*
	 * 手机关联
	 */
	public boolean queryUserMobInfo(Element root){
		Element message = root.element("queryUserMobInfo");
		if(message == null){
			message = root.addElement("queryUserMobInfo");
			for(int i=1;i<3;i++){
				Element list = message.addElement("info");
				list.addElement("ssn").addText("guopan0518");
				list.addElement("bindIp").addText("192.168.194.219");
				list.addElement("unbindIp").addText("220.181.72.180 北京市,(南三环洋桥电信机房),电信");
				list.addElement("status").addText("关联已验证");
				list.addElement("bindTime").addText("2012-07-19 13:49:05.0");
				list.addElement("unbindTime").addText("2012-07-19 13:49:05.0");
				list.addElement("moblie").addText("13751758716");
			}
		}
		return false;
	}

	/*
	 * 持久化帐号改动信息的数据
	 */
	public boolean queryIUserModifyLog(Element root){
		Element message = root.element("queryIUserModifyLog");
		if(message == null){
			message = root.addElement("queryIUserModifyLog");
			
			message.addElement("ssn").addText("guopan0518");
	
			message.addElement("bmEmailModify").addText("1");
			message.addElement("bmEmailUpdateTime").addText("2012-06-14 13:44:27.0");
			message.addElement("bmEmailUpdateIp").addText("218.107.55.172 广东省,广州市,联通");
			
			message.addElement("pwdModify").addText("1");
			message.addElement("pwdUpdateTime").addText("2012-06-14 13:44:27.0");
			message.addElement("pwdUpdateIp").addText("218.107.55.172 广东省,广州市,联通");
	
			message.addElement("qqModify").addText("1");
			message.addElement("qqUpdateTime").addText("2011-08-12 14:09:01.0");
			message.addElement("qqUpdateIp").addText("218.107.55.254 广东省,广州市,联通");
	
			message.addElement("pingMaModify").addText("1");
			message.addElement("pingMaUpdateTime").addText("2012-06-14 13:44:27.0");
			message.addElement("pingMaUpdateIp").addText("218.107.55.172 广东省,广州市,联通");
			
			message.addElement("IdModify").addText("0");
			message.addElement("IdUpdateTime").addText("");
			message.addElement("IdUpdateIp").addText("");
			
			message.addElement("qestionModify").addText("1");
			message.addElement("questionUpdateTime").addText("2012-06-14 13:44:27.0");
			message.addElement("questionUpdateIp").addText("218.107.55.172 广东省,广州市,联通");
		}
		return false;
	}

	public boolean queryRegTimeAddr(Element root){
		Element message = root.element("queryRegTimeAddr");
		if(message == null){
			message = root.addElement("queryRegTimeAddr");
			message.addElement("regTime").addText("2010-07-26 21:19:57.0");
			message.addElement("regAddress").addText("113.64.250.253|广东省,广州市,电信");
		}
		return false;
	}

	/*
	 * 密码问题
	 */
	public boolean queryHistorySecureInfo(Element root){
		Element message = root.element("queryHistorySecureInfo");
		if(message == null){
			message = root.addElement("queryHistorySecureInfo");
			message.addElement("password").addText("123");
		}
		return false;
	}

}
