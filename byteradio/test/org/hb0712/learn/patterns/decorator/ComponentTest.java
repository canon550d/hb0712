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
		Component iceCream = new ConceteComponent();			//HttpClient
		Decorator ChocolateIceCream = new ConceteDecorator(iceCream);		//StringHttpClient
		Decorator BlueberryChocolateIceCream = new ConceteDecorator2(ChocolateIceCream);		//JsonHttpClient
		int o = BlueberryChocolateIceCream.operation();
		System.out.print("最终购买" + o +"块");
	}

}
