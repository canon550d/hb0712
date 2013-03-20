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
		this.after();
	}
	
	private void before(){
		System.out.println("代理A,打开网络");
	}
	
	private void after(){
		System.out.println("代理A,关闭网络");
	}

}
