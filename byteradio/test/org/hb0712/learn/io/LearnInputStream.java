package org.hb0712.learn.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

import org.junit.Test;

/*
 * 
 */
@SuppressWarnings("deprecation")
public class LearnInputStream {

	
	/*
	 * ������ԥ�ĵ�һ��Ҫѧϰ��InputStream����FileInputStream
	 * ���κ�ϵͳ�У��ļ�����������Ҫ�õġ�
	 */
	@Test
	public void lessonFileInputStream() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		
		int length;
		while(-1 != (length=fis.read())){//���������ж�ȡ���ݵ���һ���ֽڣ�����0��255��Χ�ڵ�int�ֽ�ֵ
			System.out.print((char)length);//ǿ��ת��
		}
		fis.close();
	}
	
	@Test
	public void lessonFileInputStreamBuffer() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		byte[] buffer = new byte[20];//���ֵ�ĸı��Ӱ������ʱ��
		int length;
		while(-1 != (length=fis.read(buffer))){
			System.out.println(new String(buffer, 0, length));//ÿ�ε�read�󲻻����buffer��ֻ�Ǹ���֮ǰ�����ݣ������Ҫע��
		}

		fis.close();
	}

	/*
	 * ��ʵ˵����������ҵ�����Ҳ��������ʲô�ã���Ψһ�뵽����socketͨѶ�п����õ��ϡ�
	 * ����������У������϶����ö���byte��ô�ͼ�����ȫ������ʲô�á�
	 */
	public static void lessonByteArrayInputStream() throws IOException{
		byte[] b = {1,2,3,11,'a','b','c'};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		int s;
		while(-1 != (s=bis.read())){
			System.out.println(s);
		}
	}
	
	public static void lessonStringBufferInputStream(){
		String s = "cao";
		new StringBufferInputStream(s);// �����Ƽ�ʹ���ˣ����ü���д��ȥ��
	}

	@Test
	public void lessonBufferedInputStream() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		BufferedInputStream bis = new BufferedInputStream(fis);//����������û����С
		int s;
		while(-1 != (s=bis.read())){
			System.out.print((char)s);
		}
	}
}
