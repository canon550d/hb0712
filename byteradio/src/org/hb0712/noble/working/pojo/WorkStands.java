package org.hb0712.noble.working.pojo;

import java.util.ArrayList;
import java.util.List;


/*
 * work£¬work for 
 */
public class WorkStands {
	private int id;
	
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

	
	
}
