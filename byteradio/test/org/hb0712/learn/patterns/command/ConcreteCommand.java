package org.hb0712.learn.patterns.command;


public class ConcreteCommand implements Command {
	
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}

	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("ÃüÁîA");
		this.receiver.action();
		return 1;
	}

}
