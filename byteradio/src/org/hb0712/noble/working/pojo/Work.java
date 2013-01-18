package org.hb0712.noble.working.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Work {
	private int id;
	private Human human;	//¿ÉÄÜÎª¿Õ
	private Date workTime;
	private String text;
	private List<Conversation> conversations = new ArrayList<Conversation>();
	

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

	public List<Conversation> getConversations() {
		return conversations;
	}

	public void setConversations(List<Conversation> conversations) {
		this.conversations = conversations;
	}




}
