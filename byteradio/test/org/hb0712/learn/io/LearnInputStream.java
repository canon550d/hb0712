package org.hb0712.learn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class LearnInputStream {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		lessonFileInputStream();
	}
	
	public static void lessonFileInputStream() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		StringBuffer sb = new StringBuffer();
		byte[] buffer = new byte[10];
		int length;
		while(-1 != (length=fis.read(buffer))){
			sb.append(new String(buffer, 0, length));//ÿ�ε�read�󲻻����buffer��ֻ�Ǹ���֮ǰ�����ݣ������Ҫע��
		}

		fis.close();
		System.out.println(sb.toString());
	}

	
}
