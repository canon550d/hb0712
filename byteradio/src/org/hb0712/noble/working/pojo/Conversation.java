package org.hb0712.noble.working.pojo;

import java.util.Date;

/*
 * �ܶ�ط������лỰ����Ҫ���п����Ƕ��ף��п��������˶Ի���Ҳ�п����Ƕ෽��̸
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
