package org.hb0712.noble.working.pojo;

import java.util.ArrayList;
import java.util.List;


/*
 * work£¬work for 
 */
public class WorkStands {
	private int id;
	private User user;
	
	private List<Work> works = new ArrayList<Work>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Work> getWorks() {
		return works;
	}
	public void setWorks(List<Work> works) {
		this.works = works;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
