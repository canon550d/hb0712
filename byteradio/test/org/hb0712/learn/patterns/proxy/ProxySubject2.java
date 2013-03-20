package org.hb0712.learn.patterns.proxy;

public class ProxySubject2 implements Subject {
	
	private Subject subject;
	
	public ProxySubject2(Subject subject){
		this.subject = subject;
	}

	public void reuqest() {
		// TODO Auto-generated method stub
		this.before();
		subject.reuqest();
		this.after();
	}
	
	private void before(){
		System.out.println("代理B,创建连接");
	}
	
	private void after(){
		System.out.println("代理B,关闭连接");
	}

}
