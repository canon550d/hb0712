package org.hb0712.learn.patterns.decorator;

/*
 * 这样我就把inputstream变成了我需要的json格式。
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
