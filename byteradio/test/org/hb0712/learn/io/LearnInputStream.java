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
			sb.append(new String(buffer, 0, length));//每次的read后不会清空buffer，只是覆盖之前的数据，这点需要注意
		}

		fis.close();
		System.out.println(sb.toString());
	}

	
}
