package org.hb0712.learn.patterns.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用者
		Invoker i = new Invoker();
		//接收者
		Receiver r = new Receiver();
		
		Command c = new ConcreteCommand(r);
		i.setCommand(c);
		i.action();
		
		Command c2 = new ConcreteCommand2(r);
		i.setCommand(c2);
		i.action();
	}

}
