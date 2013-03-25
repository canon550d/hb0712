package org.hb0712.learn.patterns.command;

public class Invoker {
	private Command command;
	
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public int action(){
		System.out.println("��Ҫִ��һ������");
		return this.command.execute();
	}

}
