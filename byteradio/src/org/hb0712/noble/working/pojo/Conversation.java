package org.hb0712.noble.working.pojo;

import java.util.Date;

/*
 * 很多地方都会有会话的需要，有可能是独白，有可能是两人对话，也有可能是多方交谈
 */
public class Conversation {
	private int id;
	private String text;
	private Date time;
	private Employee speaker;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Employee getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Employee speaker) {
		this.speaker = speaker;
	}

	
}
