package org.hb0712.learn.patterns.adapter;

/*
 * ÊÊÅäÆ÷
 */
public class Adapter extends Adaptee implements Target {

	public void request() {
		// TODO Auto-generated method stub
		super.specificRequest();
		System.out.println("±äµçÑ¹110V");
	}

}
