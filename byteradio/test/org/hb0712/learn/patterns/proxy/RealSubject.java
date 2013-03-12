package org.hb0712.learn.patterns.proxy;

public class RealSubject implements Subject {

	@Override
	public void reuqest() {
		// TODO Auto-generated method stub
		System.out.println("从数据库读取了数据");
	}

}
