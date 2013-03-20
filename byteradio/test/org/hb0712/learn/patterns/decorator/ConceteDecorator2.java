package org.hb0712.learn.patterns.decorator;

public class ConceteDecorator2 extends Decorator {
	
	public ConceteDecorator2(Component component){
		super(component);	//Implicit super constructor Decorator() is undefined. Must explicitly invoke
	}

	@Override
	public int operation() {
		// TODO Auto-generated method stub
		int o = super.operation();
		return o + this.toJson();
	}
	
	private int toJson(){
		System.out.println("ÃÌº””£Ã“+4øÈ");
		return 4;
	}

}
