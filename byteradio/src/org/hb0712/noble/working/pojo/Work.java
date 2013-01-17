package org.hb0712.noble.working.pojo;

import java.util.Date;


public class Work {
	private int id;
	private Human human;
	private Date workTime;
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	public Date getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}



	
}
