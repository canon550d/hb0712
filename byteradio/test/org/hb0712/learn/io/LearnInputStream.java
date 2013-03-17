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
	 * 毫不犹豫的第一个要学习的InputStream就是FileInputStream
	 * 在任何系统中，文件操作都是需要用的。
	 */
	@Test
	public void lessonFileInputStream() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		
		int length;
		while(-1 != (length=fis.read())){//从输入流中读取数据的下一个字节，返回0到255范围内的int字节值
			System.out.print((char)length);//强制转换
		}
		fis.close();
	}
	
	@Test
	public void lessonFileInputStreamBuffer() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		byte[] buffer = new byte[20];//这个值的改变会影响运行时间
		int length;
		while(-1 != (length=fis.read(buffer))){
			System.out.println(new String(buffer, 0, length));//每次的read后不会清空buffer，只是覆盖之前的数据，这点需要注意
		}

		fis.close();
	}

	/*
	 * 老实说，这个东西我到现在也不明白有什么用，我唯一想到的是socket通讯中可能用得上。
	 * 面向对象编程中，基本上都在用对象，byte这么低级的完全不懂有什么用。
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
		new StringBufferInputStream(s);// 都不推荐使用了，不用继续写下去了
	}

	@Test
	public void lessonBufferedInputStream() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:/hello.txt"));
		BufferedInputStream bis = new BufferedInputStream(fis);//这里可以设置缓存大小
		int s;
		while(-1 != (s=bis.read())){
			System.out.print((char)s);
		}
	}
}
