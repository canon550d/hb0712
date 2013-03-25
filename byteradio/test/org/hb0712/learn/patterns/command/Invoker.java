package org.hb0712.learn.patterns.command;

public class Invoker {
	private Command command;
	
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public int action(){
		System.out.println("我要执行一个命令");
		return this.command.execute();
	}

}
