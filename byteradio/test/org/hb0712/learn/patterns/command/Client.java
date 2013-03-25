package org.hb0712.learn.patterns.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用者
		Invoker tvController = new Invoker();
		//接收者
		Receiver tv = new Receiver();
		
		Command on = new ConcreteCommand(tv);
		tvController.setCommand(on);
		int i = tvController.action();
		
		Command off = new ConcreteCommand2(tv);
		tvController.setCommand(off);
		tvController.action();
	}

}
