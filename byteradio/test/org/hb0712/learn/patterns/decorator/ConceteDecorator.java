package org.hb0712.learn.patterns.decorator;

public class ConceteDecorator extends Decorator {
	
	public ConceteDecorator(Component component){
		super(component);	//Implicit super constructor Decorator() is undefined. Must explicitly invoke
	}

	@Override
	public int operation() {
		// TODO Auto-generated method stub
		this.before();
		int o = super.operation();
		return o + this.after();
	}
	
	private void before(){
		System.out.println("װ����A");
	}
	
	private int after(){
		System.out.println("����ɿ���+2��");
		return 2;
	}

}
