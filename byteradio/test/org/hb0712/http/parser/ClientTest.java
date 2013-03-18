package org.hb0712.http.parser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

/*
 * 这里实际上就是AccountAttachInfo
 */
public class ClientTest {
	
	public void configMessageSnaper(){
		
	}
	
	@Test
	public void baba(){
		InputStream is = new ByteArrayInputStream(new byte[10]);
		Parse dp = new DefaultParse();
		Parse ci = new CheckIsModifySecureInfo(dp);
		Parse gs = new GetIDNumServlet(ci);
		Parse mi = new MailInfo(gs);
		Tags t = mi.action(is);		//这里不如提供一个ActiveWorkBill接口，或者提供一个
		System.out.println(t);
	}
	
	
	public Tags test(){
//		DefaultHttpClient dh = new DefaultHttpClient();
//		Parse p = new CheckIsModifySecureInfo();
//		try {
//			System.out.println(dh.read("http://192.168.16.9/xieyang/accountStateCB.html") +"\r==============\r");
//			System.out.println(dh.read("http://192.168.16.9/xieyang/queryUserMobInfo.html") +"\r==============\r");
//			System.out.println(dh.read("http://192.168.16.9/xieyang/usrLoginLogStatic.html") +"\r==============\r");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Map<String, String> result = new HashMap<String, String>();
//		result.put("xieyang", "good");
//		result.put("xieyang", "good");
//		System.out.println(result);
//		
		return new Tags();
	}
}
