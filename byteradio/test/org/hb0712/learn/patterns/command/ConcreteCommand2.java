package org.hb0712.learn.patterns.command;


public class ConcreteCommand2 implements Command {
	
	private Receiver receiver;
	
	public ConcreteCommand2(Receiver receiver){
		this.receiver = receiver;
	}

	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("����B");
		this.receiver.action();
		return 0;
	}

}
