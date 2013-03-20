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
		System.out.println("����B,��������");
	}
	
	private void after(){
		System.out.println("����B,�ر�����");
	}

}
