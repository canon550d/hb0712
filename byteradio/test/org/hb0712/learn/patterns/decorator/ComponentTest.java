package org.hb0712.learn.patterns.decorator;

/*
 * �����ҾͰ�inputstream���������Ҫ��json��ʽ��
 * 
 */
public class ComponentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hc = new ConceteComponent();			//HttpClient
		Decorator shc = new ConceteDecorator(hc);		//StringHttpClient
		Decorator jhc = new ConceteDecorator2(shc);		//JsonHttpClient
		jhc.operation();
	}

}
