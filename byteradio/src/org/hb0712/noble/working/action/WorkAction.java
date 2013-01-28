package org.hb0712.noble.working.action;

import org.hb0712.noble.working.pojo.Contact;
import org.hb0712.noble.working.pojo.ContactTest;
import org.hb0712.noble.working.pojo.WorkStands;

import com.opensymphony.xwork2.ActionSupport;

public class WorkAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private WorkStands workStands;
	private Contact contact;
	
	public WorkStands getWorkStands() {
		return workStands;
	}

	public void setWorkStands(WorkStands workStands) {
		this.workStands = workStands;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	/*
	 * 
	 */
	public String view(){
		this.contact = new ContactTest().test2();
		System.out.println(contact.getFistName());
		System.out.println("###");
		return SUCCESS;
	}
}
