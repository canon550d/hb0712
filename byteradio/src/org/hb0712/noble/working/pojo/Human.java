package org.hb0712.noble.working.pojo;

import java.util.List;

/*
 * 服务和被服务方都是以人为单位的
 * 
 */
public class Human {
	private Integer id;
	private String name;	//宋祖英

//	private List<Contact> contacts;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Email> getEmails() {
//		return emails;
		return null;
	}
	public void setEmails(List<Email> emails) {
//		this.emails = emails;
	}
	public List<Mobile> getMobiles() {
//		return mobiles;
		return null;
	}
	public void setMobiles(List<Mobile> mobiles) {
//		this.mobiles = mobiles;
	}
	
	
}
