package org.hb0712.learn.patterns.adapter;

/*
 * ������
 */
public class Adapter extends Adaptee implements Target {

	public void request() {
		// TODO Auto-generated method stub
		super.specificRequest();
		System.out.println("���ѹ110V");
	}

}
