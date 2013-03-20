package org.hb0712.learn.patterns.decorator;

/*
 * 这是一个抽象类，它的要点就在于实现了Component接口，并且有一个Component接口的成员变量。
 * 构造方法并不是必须的，用setComponent方法同样可以
 */
public abstract class Decorator implements Component{
	private Component component;

	public Decorator(Component component){
		this.component = component;
	}
	
	public int operation() {
		// TODO Auto-generated method stub
		return this.component.operation();
	}
}
