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
		Component iceCream = new ConceteComponent();			//HttpClient
		Decorator ChocolateIceCream = new ConceteDecorator(iceCream);		//StringHttpClient
		Decorator BlueberryChocolateIceCream = new ConceteDecorator2(ChocolateIceCream);		//JsonHttpClient
		int o = BlueberryChocolateIceCream.operation();
		System.out.print("���չ���" + o +"��");
	}

}
