package org.hb0712.learn.patterns.proxy;

public class ProxySubject implements Subject {
	
	private Subject subject;
	
	public ProxySubject(Subject subject){
		this.subject = subject;
	}

	public void reuqest() {
		// TODO Auto-generated method stub
		this.before();
		subject.reuqest();
	}
	
	private void before(){
		System.out.println("连接数据库");
	}

}
