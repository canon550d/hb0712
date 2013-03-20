package org.hb0712.learn.patterns.command;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void action(){
		System.out.println("我要执行一个命令");
		this.command.execute();
	}

}
