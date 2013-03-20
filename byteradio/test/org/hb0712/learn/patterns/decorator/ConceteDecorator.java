package org.hb0712.learn.patterns.decorator;

public class ConceteDecorator extends Decorator {
	
	public ConceteDecorator(Component component){
		super(component);	//Implicit super constructor Decorator() is undefined. Must explicitly invoke
	}

	@Override
	public int operation() {
		// TODO Auto-generated method stub
		int o = super.operation();
		return o + this.fuck();
	}
	
	private int fuck(){
		System.out.println("Ìí¼ÓÇÉ¿ËÁ¦+2¿é");
		return 2;
	}

}
