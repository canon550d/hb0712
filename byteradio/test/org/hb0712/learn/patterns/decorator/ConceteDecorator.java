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
		System.out.println("装饰器A");
	}
	
	private int after(){
		System.out.println("添加巧克力+2块");
		return 2;
	}

}
