package org.hb0712.learn.patterns.decorator;

/*
 * ����һ�������࣬����Ҫ�������ʵ����Component�ӿڣ�������һ��Component�ӿڵĳ�Ա������
 * ���췽�������Ǳ���ģ���setComponent����ͬ������
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
