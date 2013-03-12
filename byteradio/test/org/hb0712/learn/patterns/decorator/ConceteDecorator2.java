package org.hb0712.learn.patterns.decorator;

public class ConceteDecorator2 extends Decorator {
	
	public ConceteDecorator2(Component component){
		super(component);	//Implicit super constructor Decorator() is undefined. Must explicitly invoke
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		this.toJson();
	}
	
	public void toJson(){
		System.out.println("我把数据转换成了Json：");
	}

}
