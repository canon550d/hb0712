package org.hb0712;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CoverResponse extends HttpServletResponseWrapper{
	private PrintWriter tmpWriter;
	private StringWriter output;

	public CoverResponse(HttpServletResponse response) {
		super(response);
		output = new StringWriter();
		tmpWriter = new PrintWriter(output);
	}

	public void finalize() throws Throwable {
		 super.finalize();
		 output.close();
		 tmpWriter.close();
	}

	//����getWriter()������ʹ�������Լ������Writer
	public PrintWriter getWriter() throws IOException {
		return tmpWriter;
	}

	public String getContent() {
		tmpWriter.flush();   //ˢ�¸����Ļ��壬�꿴java.io.Writer.flush()
		String s = output.toString();
		//�˴��ɸ�����Ҫ���ж�������Լ�Writer�����ò���
		//����tmpWriter.getByteArrayOutputStream().reset()
		return s;    
	}

	public void close() throws IOException {
		tmpWriter.close();
	}
}