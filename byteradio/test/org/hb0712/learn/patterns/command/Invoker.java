package org.hb0712.learn.patterns.command;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void action(){
		System.out.println("��Ҫִ��һ������");
		this.command.execute();
	}

}
