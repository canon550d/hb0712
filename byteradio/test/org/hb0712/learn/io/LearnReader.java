package org.hb0712.learn.io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LearnReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			lessonCharArrayReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void lessonFileReader() throws IOException{
		FileReader fr = new FileReader(new File("D:/hello.txt"));
		StringBuffer sb = new StringBuffer();
		char[] buffer = new char[10];
		int length;
		while(-1 != (length=fr.read(buffer))){
			sb.append(buffer, 0, length);
		}
		fr.close();
		System.out.println(sb.toString());
	}
	
	public static void lessonBufferedReader() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File("D:/hello.txt")));
		String s ;
		while(null != (s = br.readLine())){
			System.out.println(s);
		}
	}
	
	public static void lessonCharArrayReader() throws IOException{
		String me = "Œ“»’";
		char[] buffer = me.toCharArray();
		Reader car = new CharArrayReader(buffer);
		
		int s;
		while(-1 != (s = car.read())){
			System.out.println((char)s);
		}
	}
}
