package org.hb0712.learn.patterns.decorator;

public class ConceteDecorator extends Decorator {
	
	public ConceteDecorator(Component component){
		super(component);	//Implicit super constructor Decorator() is undefined. Must explicitly invoke
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		this.fuck();
	}
	
	public void fuck(){
		System.out.println("我把数据转换成了String：");
	}

}
